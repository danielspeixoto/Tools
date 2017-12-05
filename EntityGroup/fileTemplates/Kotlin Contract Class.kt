#set($list = ${StringUtils.split($PACKAGE_NAME, ".")})
#set($pos = $list.size() - 1)
#set($entity_uncap = $list.get($pos))
#set($entity = ${StringUtils.capitalizeFirstLetter($entity_uncap)})
class ${NAME} {
    interface Controller {}
    
    interface UseCase {}
    
    interface Repository {
        fun insert($entity_uncap : $entity)
    }
}