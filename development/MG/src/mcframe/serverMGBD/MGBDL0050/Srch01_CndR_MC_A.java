package mcframe.serverMGBD.MGBDL0050;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public static final String $msg_id = "msg_id";
	/**
	 * Message 1 メッセージ１.<p>
	 *
	 */
	public static final String $msg1 = "msg1";
	/**
	 * Message 2 メッセージ２.<p>
	 *
	 */
	public static final String $msg2 = "msg2";
	/**
	 * Message 3 メッセージ３.<p>
	 *
	 */
	public static final String $msg3 = "msg3";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta msg1_META = createCommonMeta($msg1, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta msg2_META = createCommonMeta($msg2, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta msg3_META = createCommonMeta($msg3, mcframe.commonMA.meta.MA_META.MSG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			msg_id_META,
			msg1_META,
			msg2_META,
			msg3_META
		},
		new String[][]{
			{
			},
			{
			}
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
	}


	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return getConstString(offset + 2, $msg_id);
	}

	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		setConstString(offset + 2, $msg_id, value);
	}


	/**
	 * Message 1 メッセージ１.<p>
	 *
	 */
	public String msg1() {
		return getConstString(offset + 3, $msg1);
	}

	/**
	 * Message 1 メッセージ１.<p>
	 *
	 */
	public void msg1(String value) {
		setConstString(offset + 3, $msg1, value);
	}


	/**
	 * Message 2 メッセージ２.<p>
	 *
	 */
	public String msg2() {
		return getConstString(offset + 4, $msg2);
	}

	/**
	 * Message 2 メッセージ２.<p>
	 *
	 */
	public void msg2(String value) {
		setConstString(offset + 4, $msg2, value);
	}


	/**
	 * Message 3 メッセージ３.<p>
	 *
	 */
	public String msg3() {
		return getConstString(offset + 5, $msg3);
	}

	/**
	 * Message 3 メッセージ３.<p>
	 *
	 */
	public void msg3(String value) {
		setConstString(offset + 5, $msg3, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg1.equalsIgnoreCase(name)) {
			return msg1();
		}
		if ($msg2.equalsIgnoreCase(name)) {
			return msg2();
		}
		if ($msg3.equalsIgnoreCase(name)) {
			return msg3();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg1.equalsIgnoreCase(name)) {
			return msg1();
		}
		if ($msg2.equalsIgnoreCase(name)) {
			return msg2();
		}
		if ($msg3.equalsIgnoreCase(name)) {
			return msg3();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg1.equalsIgnoreCase(name)) {
			msg1(value);
			return;
		}
		if ($msg2.equalsIgnoreCase(name)) {
			msg2(value);
			return;
		}
		if ($msg3.equalsIgnoreCase(name)) {
			msg3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg1.equalsIgnoreCase(name)) {
			msg1(value);
			return;
		}
		if ($msg2.equalsIgnoreCase(name)) {
			msg2(value);
			return;
		}
		if ($msg3.equalsIgnoreCase(name)) {
			msg3(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

