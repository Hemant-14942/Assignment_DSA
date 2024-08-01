class Entry:
    def __init__(self,key,value):
      self.key=key
      self.value = value
      self.hash = hash(key)
class HT:
    def __init__(self):
      self.size=0
      self.capacity = 5
      self.data = [[] for i in range(self.capacity)]
    
    def getSize(self) ->int:
       return self.size
   
    def insert(self,key,value):
        entry = Entry(key,value)
        index = entry.hash % self.capacity
        isUpdated = False
        
        for i in range(len(self.data[index])):
            if(self.data[index][i].key ==key):
                self.data[index][i] = entry
                isUpdated = True
                break
            
        if(not(isUpdated)):
            self.data[index].append(entry)
            self.size +=1
        
    def remove(key):
        index = hash(key) % self.capacity
        
        for i in range(len(self.data))
           
    def get(self,key):
        index = hash(key) % self.capacity
        bucket = self.data[index]
        
        for entry in bucket:
            if entry.key == key:
                return entry.value
        return None 
            
         
        
    def print(self):
        for i in range(self.capacity):
            print("bucket"+str(i)+":"+str(self.data[i]))
        for e in self.data[i]:
            print(e,sep ="->")    