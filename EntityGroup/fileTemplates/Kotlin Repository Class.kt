#set($list = ${StringUtils.split($PACKAGE_NAME, ".")})
#set($pos = $list.size() - 1)
#set($entity_uncap = $list.get($pos))
#set($entity = ${StringUtils.capitalizeFirstLetter($entity_uncap)})
class ${NAME}() : ${entity}Contract.Repository {

    override fun insert($entity_uncap: ${entity}) {
        //TODO Implement
    }

} 