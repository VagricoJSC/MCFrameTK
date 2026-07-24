package mcframe.serverPFUD.PFUDL0050;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.io.*;

import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.commonPF.notice.PF_Msg.*;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.io.File;

abstract public class PFUDL_AbstFmt_MC {

	/**
	 *  キー情報を格納するマップ
	 */
	protected HashMap<String, PFUDL_KeyInfo> _keyMap;

	protected PFUDL_KeyUtil _keyUtil;

	/**
	 * エラーと判定するメッセージのレベル
	 */
	protected MCMessageLevel[] _errMsgLvls = {MCMessageLevel.WARN, MCMessageLevel.PROBLEM, MCMessageLevel.ERROR, MCMessageLevel.FATAL};
	
	/**
	 *  チェック処理のメッセージを格納するメッセージリスト
	 */
	protected MCMessageList _msgList;

	/** 
	 * フォーマットチェック時のメッセージのcauseRow
	 */
	protected MCRow _checkFmtCauseRow;
	
	/** 
	 * 解析対象のファイル
	 */
	protected File _file;

	/**
	 * rootノード。チェック処理後に代入される。
	 */
	protected MCNode _root;
	
	/**
	 * 配列の値をバインド値として使用する場合の区切り文字
	 */
	protected String _bindStrsSep = ", ";
	
	/**
	 * 配列の値をバインド値として使用する場合の囲い文字。空白文字が視認できるように文字を囲む。
	 */
	protected String _bindStrsHeadEnd = "\"";
	
	/**
	 * フォーマット情報を初期化する。
	 */
	public void init() {
		initCachePre();
		createFmt();
		initCachePost();
	}
	
	protected void initCachePre() {
		_keyMap = new HashMap<>();
		_keyUtil = new PFUDL_KeyUtil();
	}
	
	protected void initCachePost() {
		_keyUtil.setRawKeyList(_keyMap.keySet());
	}
	
	/**
	 * フォーマット情報（キー情報の集合）を生成する。
	 */
	abstract protected void createFmt();
	
	/**
	 * 
	 */
	protected String anyKey() {
		return _keyUtil._anyKey;
	}
	
	/**
	 * キー情報を生成する。
	 */
	protected PFUDL_KeyInfo createKeyInfo(String... keys) {
		PFUDL_KeyInfo keyInfo = new PFUDL_KeyInfo();
		keyInfo.setKey(createKey(keys));
		setKeyInfo(keyInfo);
		return keyInfo;
	}
	
	protected String createKey(String... keys) {
		return _keyUtil.createKey(keys);
	}
	
	protected void setKeyInfo(PFUDL_KeyInfo keyInfo) {
		_keyMap.put(keyInfo.getKey(), keyInfo);
	}
	
	/**
	 * キー情報を取得する。
	 */
	protected PFUDL_KeyInfo getRawKeyInfo(String key) {
		return _keyMap.get(key);
	}
	
	/**
	 * キー情報を取得する。曖昧キーを含まないキーから、曖昧キーを考慮して、キー情報を取得する。
	 */
	protected PFUDL_KeyInfo getKeyInfo(String... keys) {
		String key = createKey(keys);
		PFUDL_KeyInfo keyInfo = _keyMap.get(key);
		if (keyInfo == null) {
			keyInfo = getRawKeyInfo(_keyUtil.getRawKey(key));
		}
		return keyInfo;
	}
	
	/**
	 * rootノードがフォーマット情報に従っているか否かチェックする。
	 */
	public void checkFmt(String path, MCRow causeRow) {
		if (isNull(path)) {
			return ;
		}
		preCheckFmt(path, causeRow);
		_root = createNode(path, causeRow);
		if (_root == null) {
			return ;
		}
		checkFmtRootNode(_root, _msgList, causeRow);
		checkFmtChildNode(_root, _msgList, causeRow);
		checkFmtSub(_root, _msgList, causeRow);
	}
	
	/** チェック処理時のエラーメッセージを取得する。 */
	public MCMessageList getErrMsgList() {
		return _msgList.subList(_errMsgLvls);
	}
	
	/** チェックエラーがあったか否か */
	public boolean hasErr() {
		for (MCMessageLevel lvl : _errMsgLvls) {
			if (_msgList.containsLevel(lvl)) {
				return true;
			}
		}
		return false;
	}
	
	protected MCMessage addMsg(String id, Object... objs) {
		MCMessage msg = crtMsg(id, objs);
		addMsg(msg);
		return msg;
	}
	
	protected MCMessage addMsg(MCMessage msg) {
		if (msg != null) {
			_msgList.add(msg);
		}
		return msg;
	}
	
	protected MCMessage crtMsg(String id, Object... objs) {
		MCMessage msg = new MCMessage(_checkFmtCauseRow, null, id, _file.getParent(), _file.getName());
		for (int i=0; i < objs.length; i++) {
			msg.setBind(3+i, objs[i]);
		}
		return msg;
	}
	
	protected String bindStrs(Object[] vals) {
		if (vals.length == 0) {
			return null;
		}
		if (vals.length == 1) {
			return vals[0].toString();
		}
		StringBuilder sb = new StringBuilder();
		sb.append(_bindStrsHeadEnd).append(vals[0]).append(_bindStrsHeadEnd);
		for (int i = 1; i < vals.length; i++) {
			sb.append(_bindStrsSep);
			sb.append(_bindStrsHeadEnd).append(vals[i]).append(_bindStrsHeadEnd);
		}
		return sb.toString();
	}
	
	/**
	 * チェック処理用の前処理
	 */
	protected void preCheckFmt(String path, MCRow causeRow) {
		_msgList = new MCMessageList();
		_checkFmtCauseRow = causeRow;
	}
	
	protected MCNode createNode(String path, MCRow causeRow) {
		_file = new File(path);
		if (!_file.exists()) {
			addMsg(PFUDL0001);
			return null;
		}
		MCNode node = null;
		try {
			node = MCNodeFactory.create(path);
		}
		catch(MCException ex) {
			if (isSame(ex.getID(), Core_Msg.FCUCC0021)) {
				addMsg(PFUDL0002);
			}
			else {
				throw ex;
			}
		}
		return node;
	}
	
	/**
	 * rootノードに対する子ノードの必須チェック
	 */
	protected void checkFmtRootNode(MCNode root, MCMessageList msgList, MCRow causeRow) {
		if (root == null) {
			return ;
		}

		for (String key : _keyUtil.getChildOfRootLastKeys()) {
			PFUDL_KeyInfo keyInfo = getKeyInfo(key);
			if (keyInfo == null) {
				continue;
			}
			
			if (keyInfo.isReq()) {
				if (root.containsKey(key) == false) {
					addMsg(PFUDL0003, key);
				}
			}
		}
	}
	
	/**
	 * 親ノードの子ノードに対するキー情報の整合性チェック
	 */
	protected void checkFmtChildNode(MCNode parentNode, MCMessageList msgList, MCRow causeRow) {
		// 親ノードに対する子ノードの必須チェック
		checkFmtChildNodeReq(parentNode, msgList, causeRow);
		
		// 以下、存在している子ノードに対するチェック
		ArrayList<String> childKeyList = getChildKeyList(parentNode);
		if (childKeyList.isEmpty()) {
			return ;
		}
		
		// 子ノードの属性チェック
		for (String childKey : childKeyList) {
			checkFmtNode(parentNode, childKey, msgList, causeRow);
		}
		
		// 孫ノードのチェック：再帰呼出
		for (String childKey : childKeyList) {
			if (parentNode.getNodeType(childKey) == MCNodeType.NONE) {
				// サポート対象外はスキップ
			}
			else if (parentNode.isArray(childKey)) {
				MCNode[] childNodes = parentNode.getNodeArray(childKey);
				if (childNodes != null) {
					for (MCNode childNode : childNodes) {
						if (childNode == null) {
							continue;
						}
						if (childNode.getNodeType() == MCNodeType.NONE) {
							// サポート対象外はスキップ
						}
						else if (childNode.isArray()) {
							checkFmtChildArrNode(childNode, msgList, causeRow);
						}
						else {
							checkFmtChildNode(childNode, msgList, causeRow);
						}
					}
				}
			}
			else {
				checkFmtChildNode(parentNode.getNode(childKey), msgList, causeRow);
			}
		}
	}
	
	/**
	 * 親ノードに対する子ノードの必須チェック
	 */
	protected void checkFmtChildNodeReq(MCNode parentNode, MCMessageList msgList, MCRow causeRow) {
		for (String childLastKey : _keyUtil.getChildLastKeys(parentNode.getNodeKey())) {
			PFUDL_KeyInfo keyInfo = getKeyInfo(parentNode.getNodeKey(), childLastKey);
			if (keyInfo == null) {
				continue;
			}
			
			if (keyInfo.isReq()) {
				if (parentNode.containsKey(childLastKey) == false) {
					addMsg(PFUDL0004, parentNode.getNodeKey(), childLastKey);
				}
			}
		}
	}
	
	protected void checkFmtNode(MCNode parentNode, String childKey, MCMessageList msgList, MCRow causeRow) {
		PFUDL_KeyInfo keyInfo = getKeyInfo(parentNode.getNodeKey(), childKey);
		checkFmtNode(parentNode, childKey, keyInfo, msgList, causeRow);
	}
	
	protected void checkFmtNode(MCNode parentNode, String childKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		// フォーマットが規定されていないキーはチェックしない
		if (keyInfo == null) {
			return ;
		}
		
		String childFullKey = createKey(parentNode.getNodeKey(), childKey);
		// 文字型
		if (keyInfo.isString()) {
			checkFmtNodeString(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// 数値型
		else if (keyInfo.isNumber()) {
			checkFmtNodeNumber(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// 論理型
		else if (keyInfo.isBoolean()) {
			checkFmtNodeBoolean(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// オブジェクト型
		else if (keyInfo.isObject()) {
			checkFmtNodeObject(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// 文字型の配列
		else if (keyInfo.isStringArray()) {
			checkFmtNodeStringArray(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// 数値型の配列
		else if (keyInfo.isNumberArray()) {
			checkFmtNodeNumberArray(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// 論理型の配列
		else if (keyInfo.isBooleanArray()) {
			checkFmtNodeBooleanArray(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// オブジェクトまたは配列の配列
		else if (keyInfo.isObjectArray() || keyInfo.isArrayNode()) {
			checkFmtNodeArray(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
		// データ型が未定義、他のキーの値に応じて動的に変わるなどを想定
		else {
			checkFmtNodeOther(parentNode, childKey, childFullKey, keyInfo, msgList, causeRow);
		}
	}

	protected void checkFmtNodeString(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isString(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_STR);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
		else {
			String val = keyInfo.isTrim() ? parentNode.getNodeString(new String[] {childKey}) : parentNode.getNodeStringNoTrim(new String[] {childKey});
			if (keyInfo.isSameNullBlank()) {
				if (isNull(val)) {
					val = null;
				}
			}
			
			if (val == null) {
				// 空文字に対するNotNullチェック
				if (keyInfo.isNotNull()) {
					addMsg(PFUDL0006, childFullKey);
				}
			}
			else {
				String[] strs = keyInfo.selectStr();
				if (strs != null) {
					boolean errFlg = true;
					for (String str : strs) {
						if (isSame(val, str)) {
							errFlg = false;
							break;
						}
					}
					if (errFlg) {
						addMsg(PFUDL0007, childFullKey, val, bindStrs(strs));
					}
				}
			}
		}
	}
	
	protected void checkFmtNodeStringArray(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isStringArray(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_STRs);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.EMPTY_ARRAY) {
			if (keyInfo.isNotZeroSize()) {
				addMsg(PFUDL0009, childFullKey);
			}
		}
		else {
			String[] vals = keyInfo.isTrim() ? 
					parentNode.getNodeStringArray(childKey) : parentNode.getNodeStringArrayNoTrim(childKey);
			
			if (vals == null) {
				if (keyInfo.isNotNull()){
					addMsg(PFUDL0006, childFullKey);
				}
			}
			else if (vals.length == 0) {
				if (keyInfo.isNotZeroSize()) {
					addMsg(PFUDL0009, childFullKey);
				}
			}
			else {
				if (keyInfo.isArrayNotNull()) {
					for (String val : vals) {
						if (keyInfo.isSameNullBlank()) {
							if (isNull(val)) {
								val = null;
							}
						}
						if (val == null) {
							addMsg(PFUDL0010, childFullKey);
							break;
						}
					}
				}
				
				String[] strs = keyInfo.selectStr();
				if (strs != null) {
					for (String val : vals) {
						if (val == null) {
							continue;
						}
						
						boolean errFlg = true;
						for (String str : strs) {
							if (isSame(val, str)) {
								errFlg = false;
								break;
							}
						}
						if (errFlg) {
							addMsg(PFUDL0007, childFullKey, val, bindStrs(strs));
						}
					}
				}
				
				if (keyInfo.isArrayNotDupVal()) {
					Set<String> dupSet = getDupVals(vals);
					if (dupSet.isEmpty() == false) {
						addMsg(PFUDL0011, childFullKey, bindStrs(dupSet.toArray(new String[0])));
					}
				}
			}
		}
	}
	
	protected void checkFmtNodeNumber(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isNumber(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_NUM);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
		else {
			MCNumber val = parentNode.getNodeNumber(childKey);
			
			if (val == null) {
				if (keyInfo.isNotNull()) {
					addMsg(PFUDL0006, childFullKey);
				}
			}
			else {
				if (keyInfo.isInt()) {
					if (parentNode.isInteger(childKey) == false) {
						addMsg(PFUDL0008, childFullKey, val);
					}
				}
			}
		}
	}
	
	protected void checkFmtNodeNumberArray(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isNumberArray(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_NUMs);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.EMPTY_ARRAY) {
			if (keyInfo.isNotZeroSize()) {
				addMsg(PFUDL0009, childFullKey);
			}
		}
		else {
			MCNumber[] vals = parentNode.getNodeNumberArray(childKey);
			
			if (vals == null) {
				if (keyInfo.isNotNull()){
					addMsg(PFUDL0006, childFullKey);
				}
			}
			else if (vals.length == 0) {
				if (keyInfo.isNotZeroSize()) {
					addMsg(PFUDL0009, childFullKey);
				}
			}
			else {
				if (keyInfo.isArrayNotNull()) {
					for (MCNumber val : vals) {
						if (val == null) {
							addMsg(PFUDL0010, childFullKey);
							break;
						}
					}
				}
				if (keyInfo.isInt()) {
					for (MCNumber val : vals) {
						if (val == null) {
							continue;
						}
						if (val.divide(MCNumber.ONE).neq(MCNumber.ZERO)) {
							addMsg(PFUDL0008, childFullKey, val);
							break;
						}
					}
				}
				
				if (keyInfo.isArrayNotDupVal()) {
					Set<MCNumber> dupSet = getDupVals(vals);
					if (dupSet.isEmpty() == false) {
						addMsg(PFUDL0011, childFullKey, bindStrs(dupSet.toArray(new String[0])));
					}
				}
			}
		}
	}
	
	protected void checkFmtNodeBoolean(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isBoolean(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_BOO);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
	}
	
	protected void checkFmtNodeBooleanArray(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isBooleanArray(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_BOOs);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.EMPTY_ARRAY) {
			if (keyInfo.isNotZeroSize()) {
				addMsg(PFUDL0009, childFullKey);
			}
		}
		else {
			boolean[] vals = parentNode.getNodeBooleanArray(childKey);
			if (vals == null) {
				if (keyInfo.isNotNull()) {
					addMsg(PFUDL0006, childFullKey);
				}
			}
			else if (vals.length == 0) {
				if (keyInfo.isNotZeroSize()) {
					addMsg(PFUDL0009, childFullKey);
				}
			}
		}
	}
	
	protected void checkFmtNodeObject(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isObject(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_OBJ);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
	}
	
	protected void checkFmtNodeArray(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (parentNode.isArray(childKey) == false) {
			addMsg(PFUDL0005, childFullKey, keyInfo.isObjectArray() ? PFUDL_KeyInfo.DATA_TYP_OBJs : PFUDL_KeyInfo.DATA_TYP_ARR);
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
		else if (parentNode.getNodeType(childKey) == MCNodeType.EMPTY_ARRAY) {
			if (keyInfo.isNotZeroSize()) {
				addMsg(PFUDL0009, childFullKey);
			}
		}
		else {
			MCNode[] vals = parentNode.getNodeArray(childKey);
			
			if (vals == null) {
				if (keyInfo.isNotNull()){
					addMsg(PFUDL0006, childFullKey);
				}
			}
			else if (vals.length == 0) {
				if (keyInfo.isNotZeroSize()) {
					addMsg(PFUDL0009, childFullKey);
				}
			}
			else {
				if (keyInfo.isObjectArray()) {
					for (MCNode val : vals) {
						if (val != null && !val.isObject()) {
							addMsg(PFUDL0005, childFullKey, PFUDL_KeyInfo.DATA_TYP_OBJs);
							break;
						}
					}
				}
				
				if (keyInfo.isArrayNotNull()) {
					for (MCNode val : vals) {
						if (val == null) {
							addMsg(PFUDL0010, childFullKey);
							break;
						}
					}
				}
			}
		}
	}
	
	protected void checkFmtNodeOther(MCNode parentNode, String childKey, String childFullKey, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		// NotNull制約以外のチェックは対象外。
		if (parentNode.getNodeType(childKey) == MCNodeType.NULL) {
			if (keyInfo.isNotNull()) {
				addMsg(PFUDL0006, childFullKey);
			}
		}
	}
	
	/**
	 * 配列ノードに対するキー情報の整合性チェック。要素が配列ノードまたはオブジェクトの配列である場合、再帰的に呼び出す。そうでない場合、要素を親キーとしてチェック処理を呼び出す。
	 */
	protected void checkFmtChildArrNode(MCNode arrNode, MCMessageList msgList, MCRow causeRow) {
		PFUDL_KeyInfo keyInfo = getKeyInfo(arrNode.getNodeKey());
		checkFmtChildArrNode(arrNode, keyInfo, msgList, causeRow);
		
		int size = arrNode.size();
		for (int i=0; i < size; i++) {
			MCNode e = arrNode.getNode(i);
			if (e == null) {
				continue;
			}
			if (e.isArray()) {
				checkFmtChildArrNode(e, msgList, causeRow);
			}
			else {
				checkFmtChildNode(e, msgList, causeRow);
			}
		}
	}
	
	protected void checkFmtChildArrNode(MCNode arrNode, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		// フォーマットが規定されていないキーはチェックしない
		if (keyInfo == null) {
			return ;
		}
		
		// 文字型
		if (keyInfo.isString()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_STR);
		}
		// 数値型
		else if (keyInfo.isNumber()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_NUM);
		}
		// 論理型
		else if (keyInfo.isBoolean()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_BOO);
		}
		// オブジェクト型
		else if (keyInfo.isObject()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_OBJ);
		}
		// 文字型の配列
		else if (keyInfo.isStringArray()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_STRs);
		}
		// 数値型の配列
		else if (keyInfo.isNumberArray()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_NUMs);
		}
		// 論理型の配列
		else if (keyInfo.isBooleanArray()) {
			addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_BOOs);
		}
		// オブジェクトまたは配列の配列
		else if (keyInfo.isObjectArray() || keyInfo.isArrayNode()) {
			checkFmtChildArrNodeArray(arrNode, keyInfo, msgList, causeRow);
		}
	}

	protected void checkFmtChildArrNodeArray(MCNode arrNode, PFUDL_KeyInfo keyInfo, MCMessageList msgList, MCRow causeRow) {
		if (arrNode.isArray() == false) {
			// nullでない配列ノードしか引数に渡さない想定。ここには到達しない想定
			addMsg(PFUDL0005, arrNode.getNodeKey(), keyInfo.isObjectArray() ? PFUDL_KeyInfo.DATA_TYP_OBJs : PFUDL_KeyInfo.DATA_TYP_ARR);
		}
		else {
			int size = arrNode.size();
			if (size == 0) {
				if (keyInfo.isNotZeroSize()) {
					addMsg(PFUDL0009, arrNode.getNodeKey());
				}
			}
			else {
				if (keyInfo.isObjectArray()) {
					for (int i = 0; i < size; i++) {
						MCNode val = arrNode.getNode(i);
						if (val != null && !val.isObject()) {
							addMsg(PFUDL0005, arrNode.getNodeKey(), PFUDL_KeyInfo.DATA_TYP_OBJs);
							break;
						}
					}
				}
				
				if (keyInfo.isArrayNotNull()) {
					for (int i = 0; i < size; i++) {
						MCNode val = arrNode.getNode(i);
						if (val == null) {
							addMsg(PFUDL0010, arrNode.getNodeKey());
							break;
						}
					}
				}
			}
		}
	}
	
	protected <T extends Comparable<?>> Set<T> getDupVals(T[] objs) {
		Set<T> dup = new HashSet<>();
		if (objs == null || objs.length <= 1) {
			return dup;
		}
		
		Set<T> all = new HashSet<>();
		for (T obj : objs) {
			if (obj == null) {
				continue;
			}
			if (all.contains(obj)) {
				dup.add(obj);
			}
			all.add(obj);
		}
		return dup;
	}
	
	protected MCMessage checkAtLeastOneKey(MCNode node, String... keys) {
		if (node == null) {
			return null;
		}
		for (String key : keys) {
			if (node.containsKey(key)) {
				return null;
			}
		}
		if (isSame(node.getNodeKey(), node.getRootNode().getNodeKey())) {
			return crtMsg(PFUDL0012, bindStrs(keys));
		}
		else {
			return crtMsg(PFUDL0013, node.getNodeKey(), bindStrs(keys));
		}
		
	}
	
	/** ノード間の値の相関チェックなどを行う。  */
	protected void checkFmtSub(MCNode root, MCMessageList msgList, MCRow causeRow) {
		// サブクラスで実装
	}
	
	protected ArrayList<String> getChildKeyList(MCNode node) {
		ArrayList<String> childKeyList = new ArrayList<>();
		if (node != null) {
			Iterator<String> it = node.getChildNodeKeys();
			if (it != null) {
				while(it.hasNext()) {
					childKeyList.add(it.next());
				}
			}
		}
		return childKeyList;
	}
	
}