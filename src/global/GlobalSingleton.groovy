package global

@Singleton
class GlobalClass implements Serializable {
	int counter = 0
	
	int getCounter() {
		return this.counter
	}
}