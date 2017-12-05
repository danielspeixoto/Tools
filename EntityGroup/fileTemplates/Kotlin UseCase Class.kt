#set($list = ${StringUtils.split($PACKAGE_NAME, ".")})
#set($pos = $list.size() - 1)
#set($entity = ${StringUtils.capitalizeFirstLetter($list.get($pos))})
class ${NAME}(private val repository : ${entity}Contract.Repository) : ${entity}Contract.UseCase {

} 