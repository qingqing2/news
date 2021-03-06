package news.common;

/**
 * Created by eric on 16/8/21.
 */
public interface ErrorCode {

	int UNKNOWN = -9999;

	// 负数为不期望会发生的错误

	/**
	 * 通用的参数无效
	 */
	int INVALID_ARGUMENT = -1000;

	/**
	 * 系统内部错误,可能由环境或配置导致的
	 */
	int SYSTEM_FAILURE = -1001;

	/**
	 * 重复提交
	 */
	int RESUBMIT = -1002;

	int RECORD_NOT_FOUND = -1003;


	/**
	 * 账户校验失败
	 */
	int SUBJECT_AUTH_FAILED = 1000;

	/**
	 * 数据校验失败，一般是指在逻辑处理中发现不符合条件的数据
	 */
	int VERIFY_FAILED = 1001;

	/**
	 * 操作不允许,一般是因为提交的数据已经发生变更,比如状态改变了,不能再执行原状态下的操作
	 */
	int OPERATION_NOT_ALLOWED = 1002;
	/**
	 * 月份是否重复
	 */
	int DUPLICATED_RECORD = 1004;

	/**
	 * 权重是否通过校验
	 */
	int VALIDATE_WEIGHT = 1005;
	/**
	 * 用户类错误 2XXX
	 */

	/**
	 * 用户登录验证类错误 20XX
	 */
	int ACCOUNT_NOT_EXIST = 2001;

	/**
	 * 密码错误
	 */
	int ACCOUNT_WRONG_PWD = 2002;

	/**
	 * 账号关闭
	 */
	int ACCOUNT_INACTIVE = 2003;
}
