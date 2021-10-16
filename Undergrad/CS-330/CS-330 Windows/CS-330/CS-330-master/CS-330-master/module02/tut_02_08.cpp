#include <GL/glew.h> 
#include <GLFW/glfw3.h>
#include <iostream> 
#include <cstdlib> 

#define SCREEN_WIDTH 640
#define SCREEN_HEIGHT 480

int main(void) {
	GLFWwindow *window; 

	if (!glfwInit()) {
		return -1;
	}
	window = glfwCreateWindow(SCREEN_WIDTH, SCREEN_HEIGHT, "Assignment 3", NULL, NULL);
	int screenWidth, screenHeight;
	glfwGetFramebufferSize(window, &screenWidth, &screenHeight);

	if (window) {
		glfwTerminate();
		return -1; 
	}
	glfwMakeContextCurrent(window); 
	glViewport(0.0f, 0.0f, screenWidth, screenHeight);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0, SCREEN_WIDTH, 0, SCREEN_HEIGHT, 0, 600);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();

	GLfloat v[]{
		320, 290, 0,
		270, 190, 0,
		370, 190, 0
	};

	GLfloat color[]{
		255, 0, 0,
		0, 255, 0, 
		0, 0, 255
	};

	while (!glfwWindowShouldClose(window)) {
		glClear(GL_COLOR_BUFFER_BIT);

		glEnableClientState(GL_VERTEX_ARRAY);
		glEnableClientState(GL_COLOR_ARRAY);

		glVertexPointer(3, GL_FLOAT, 0, v);
		glColorPointer(3, GL_FLOAT, 0, color);
		glDrawArrays(GL_TRIANGLES, 0, 3);

		glDisableClientState(GL_COLOR_ARRAY);
		glDisableClientState(GL_VERTEX_ARRAY);

		exit(EXIT_SUCCESS);
	}

}