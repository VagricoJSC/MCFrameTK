package mcframe.clientMAUB.MAUBP5310;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"RtnMsg"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RtnMsgR_MC_A extends MCConstRow {

	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Result 結果.<p>
	 *
	 */
	public static final String $rtn_sts_typ_nm = "rtn_sts_typ_nm";
	public static final String $msg_id = "msg_id";
	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public static final String $msg = "msg";


	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta rtn_sts_typ_nm_META = createCommonMeta($rtn_sts_typ_nm, mcframe.commonMA.meta.MA_META.RTN_STS_TYP_NM);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta msg_META = createCommonMeta($msg, mcframe.commonMA.meta.MA_META.MSG);

	protected static final ConstMetaList<RtnMsgR> constMetas = new ConstMetaList<RtnMsgR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rtn_sts_typ_META,
			rtn_sts_typ_nm_META,
			msg_id_META,
			msg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected RtnMsgR_MC_A(ConstMetaList<? extends RtnMsgR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RtnMsgR clone() {
		return (RtnMsgR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RtnMsgR createInstance() {
		return (RtnMsgR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RtnMsgR getValues(String... names) {
		return (RtnMsgR) super.getValues(names);
	}



	public String rtn_sts_typ() {
		return getConstString(offset + 0, $rtn_sts_typ);
	}

	public void rtn_sts_typ(String value) {
		setConstString(offset + 0, $rtn_sts_typ, value);
	}


	/**
	 * Result 結果.<p>
	 *
	 */
	public String rtn_sts_typ_nm() {
		return getConstString(offset + 1, $rtn_sts_typ_nm);
	}

	/**
	 * Result 結果.<p>
	 *
	 */
	public void rtn_sts_typ_nm(String value) {
		setConstString(offset + 1, $rtn_sts_typ_nm, value);
	}


	public String msg_id() {
		return getConstString(offset + 2, $msg_id);
	}

	public void msg_id(String value) {
		setConstString(offset + 2, $msg_id, value);
	}


	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public String msg() {
		return getConstString(offset + 3, $msg);
	}

	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public void msg(String value) {
		setConstString(offset + 3, $msg, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			return rtn_sts_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg.equalsIgnoreCase(name)) {
			return msg();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			return rtn_sts_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg.equalsIgnoreCase(name)) {
			return msg();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			rtn_sts_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg.equalsIgnoreCase(name)) {
			msg(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			rtn_sts_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg.equalsIgnoreCase(name)) {
			msg(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

