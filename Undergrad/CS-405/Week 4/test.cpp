// Uncomment the next line to use precompiled headers
// #include "pch.h"
// uncomment the next line if you do not use precompiled headers
#include <gtest/gtest.h>
//
// the global test environment setup and tear down
// you should not need to change anything here

class Environment : public ::testing::Environment{
public:
  ~Environment() override {}
  // Override this to define how to set up the environment.
  void SetUp() override{
    //  initialize random seed
    srand(time(nullptr));
  }
  // Override this to define how to tear down the environment.
  void TearDown() override {}
};

// create our test class to house shared data between tests
// you should not need to change anything here
class CollectionTest : public ::testing::Test{
protected:
  // create a smart point to hold our collection
  std::unique_ptr<std::vector<int>> collection;

  void SetUp() override{ // create a new collection to be used in the test
    collection.reset( new std::vector<int>);
  }

  void TearDown() override{ //  erase all elements in the collection, if any remain
    collection->clear();
    // free the pointer
    collection.reset(nullptr);
  }

  // helper function to add random values from 0 to 99 count times to the collection
  void add_entries(int count){
    assert(count > 0);
    for (auto i = 0; i < count; ++i)
      collection->push_back(rand() % 100);
  }
};

// When should you use the EXPECT_xxx or ASSERT_xxx macros?
// Use ASSERT when failure should terminate processing, such as the reason for the test case.
// Use EXPECT when failure should notify, but processing should continue

// Test that a collection is empty when created.
// Prior to calling this (and all other TEST_F defined methods),
//  CollectionTest::StartUp is called.
// Following this method (and all other TEST_F defined methods),
//  CollectionTest::TearDown is called
TEST_F(CollectionTest, CollectionSmartPointerIsNotNull){
  // is the collection created
  ASSERT_TRUE(collection);
  // if empty, the size must be 0
  ASSERT_NE(collection.get(), nullptr);
}

// Test that a collection is empty when created.
TEST_F(CollectionTest, IsEmptyOnCreate){
  // is the collection empty?
  ASSERT_TRUE(collection->empty());
  // if empty, the size must be 0
  ASSERT_EQ(collection->size(), 0);
}

/* Comment this test out to prevent the test from running
 * Uncomment this test to see a failure in the test explorer */
// TEST_F(CollectionTest, AlwaysFail){
//   FAIL();
// }

TEST_F(CollectionTest, CanAddToEmptyVector){
  ASSERT_TRUE(collection->empty()) << "Not empty.";
  ASSERT_EQ(collection->size(), 0) << "not zero.";
  add_entries(1);
  ASSERT_FALSE(collection->empty()) << "is empty";
}

TEST_F(CollectionTest, CanAddFiveValuesToVector){
  long int starting_size = collection->size();
  add_entries(5);
  ASSERT_EQ(collection->size() - 5, starting_size);
}

TEST_F(CollectionTest, maxSizeIsGreater){
  EXPECT_GE(collection->max_size(), collection->size());
  add_entries(1);
  EXPECT_GE(collection->max_size(), collection->size()); 
}

TEST_F(CollectionTest, lessThanCapacityIsGreater){
  unsigned long int starting_size = collection->size();
  collection->resize(starting_size + 1);
  ASSERT_GT(collection->size(), starting_size);
}

TEST_F(CollectionTest, resizingIncreasing){
  unsigned long int starting_size = collection->size();
  add_entries(15);
  ASSERT_NE(collection->size(), 0);
  collection->resize(starting_size - 1);
  ASSERT_LT(collection->size(), starting_size);
}


TEST_F(CollectionTest, reducingSize){
  unsigned long int starting_size = collection->size();
  add_entries(42);
  collection->resize(0);
  ASSERT_EQ(collection->size(), 0);
}

TEST_F(CollectionTest, decreaseToZero){
  unsigned long int starting_size = collection->size();
  add_entries(2);
  collection->clear();
  ASSERT_EQ(collection->size(), 0);
}

TEST_F(CollectionTest, eraseTest){
  unsigned long int starting_size = collection->size();
  add_entries(1);
  collection->erase(collection->begin(), collection->end());
  ASSERT_EQ(collection->size(), 0);
}

TEST_F(CollectionTest, verifyErase){
  unsigned long int starting_cap = collection->capacity();
  collection->reserve(starting_cap + 1);
  ASSERT_GT(collection->capacity(), starting_cap);
}

TEST_F(CollectionTest, test1){
  add_entries(1);
  EXCEPT_EQ(collection->size(), 1);
}

TEST_F(CollectionTest, test2){
  EXPECT_TRUE(collection->size() - 1 == -1);
}