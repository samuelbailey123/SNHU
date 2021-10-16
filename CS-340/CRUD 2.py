from pymongo import MongoClient
from bson.objectid import ObjectId

class AnimalShelter(object): 
    def __init__(self):
        self.client = MongoClient('mongodb://%s:%s@localhost:39276/?authMechanism=DEFAULT&authSource=AAC' %("aacuser", "Buddy123"))
        self.database = self.client['AAC']
        
    def create(self,data):
        if data is not None: 
            insert_result = self.database.animals.insert(data)
            
            if insert_result is not None: 
                status = True
            else: 
                status = False
            return status
        
        else:
            raise Exception("Nothing to save, missing parameter")
        
    def locate(self,data): 
        if data is not None: 
            animalsCollection = self.database.animals.find(data) 
            for animals in animalsCollection: 
                print(animals)
            else: 
                raise Exception("No search criteria")