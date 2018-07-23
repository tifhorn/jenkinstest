package global

@Singleton
class GlobalSingleton implements Serializable {
	int counter = 0
	
	int getCounter() {
		return this.counter
	}
}
