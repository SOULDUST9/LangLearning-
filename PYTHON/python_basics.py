# python_basics.py - A simple class-based task manager that allows adding, deleting, 
# and listing tasks for a user.

class TaskManager:
	def __init__(self, name):
		self.name = name 
		self.tasks = []

	def addTask(self,task):
		return self.tasks.append(task)

	def deleteTask(self,task):
		return self.tasks.remove(task)

	def listTasks(self):
		for i in self.tasks:
			print(i)
def main():
	human = TaskManager("seb")
	human.addTask("task 1")
	human.addTask("task 2")
	human.addTask("task 3")
	human.deleteTask("task 1")
	human.listTasks()

if __name__ == "__main__":
    main()