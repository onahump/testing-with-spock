import spock.lang.Specification
import Operations

class MedianaTestSpec extends Specification{

	def "Getting median from a odd list"() {
    def median = null
		given:
		def list = [3,5,6]
		Operations operations = new Operations()

		when:

		median = operations.getting_median(list)

		then:
		assert median == 5
	}

	def "Getting median from a even list"() {

		given:
		def list = [6,3,5,5,7,8]
		def clone_list , median , middle_list = null

		when:
		clone_list = list.collect().sort()
		middle_list = list.size().intdiv(2)

		median = list.size()%2 ? clone_list[middle_list] : (clone_list[middle_list - 1] + clone_list[middle_list])/ 2

		then:
		assert median == 5.5
	}

}


