package mcframe.clientMSBG.MSBGP0080;

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
 * ブロック"Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl2R_MC_A extends MCConstRow {

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_cd = "rcv_cd";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_nm = "rcv_nm";
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public static final String $rcv_typ = "rcv_typ";
	public static final String $rcv_schd_amt_p = "rcv_schd_amt_p";
	/**
	 * Payment receipt schedule No. 入金予定ＮＯ.<p>
	 *
	 */
	public static final String $rcv_schd_no = "rcv_schd_no";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";

	public static final String $rcv_schd_amt = $rcv_schd_amt_p + ".amt";

	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_cd_META = createCommonMeta($rcv_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_nm_META = createCommonMeta($rcv_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_typ_META = createCommonMeta($rcv_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta rcv_schd_amt_p_META = createInnerRowMeta($rcv_schd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta rcv_schd_no_META = createCommonMeta($rcv_schd_no, mcframe.commonMA.meta.MA_META.RCV_SCHD_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_SCHD_SUB_CHAR3);

	protected static final ConstMetaList<Dtl2R> constMetas = new ConstMetaList<Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_schd_dt_META,
			rcv_cd_META,
			rcv_nm_META,
			rcv_typ_META,
			rcv_schd_amt_p_META,
			rcv_schd_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
				"rcv_schd_amt"
			},
			{
				$rcv_schd_amt
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$rcv_cd, "sttl_nm;ar_sttl_typ"}	// rcv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		))
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
	protected Dtl2R_MC_A(ConstMetaList<? extends Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R clone() {
		return (Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R createInstance() {
		return (Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R getValues(String... names) {
		return (Dtl2R) super.getValues(names);
	}



	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 0, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 0, $rcv_schd_dt, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_cd() {
		return getConstString(offset + 1, $rcv_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_cd(String value) {
		setConstString(offset + 1, $rcv_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_nm() {
		return getConstString(offset + 2, $rcv_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_nm(String value) {
		setConstString(offset + 2, $rcv_nm, value);
	}


	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public String rcv_typ() {
		return getConstString(offset + 3, $rcv_typ);
	}

	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public void rcv_typ(String value) {
		setConstString(offset + 3, $rcv_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR rcv_schd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 4, $rcv_schd_amt_p);
	}
	
	public void rcv_schd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 4, $rcv_schd_amt_p, row);
	}


	/**
	 * Payment receipt schedule No. 入金予定ＮＯ.<p>
	 *
	 */
	public String rcv_schd_no() {
		return getConstString(offset + 5, $rcv_schd_no);
	}

	/**
	 * Payment receipt schedule No. 入金予定ＮＯ.<p>
	 *
	 */
	public void rcv_schd_no(String value) {
		setConstString(offset + 5, $rcv_schd_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 6, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 6, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 7, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 7, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 8, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 8, $sub_char3, value);
	}


	public String getString(String name) {
		if ($rcv_cd.equalsIgnoreCase(name)) {
			return rcv_cd();
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			return rcv_nm();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_schd_no.equalsIgnoreCase(name)) {
			return rcv_schd_no();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rcv_cd.equalsIgnoreCase(name)) {
			return rcv_cd();
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			return rcv_nm();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_schd_no.equalsIgnoreCase(name)) {
			return rcv_schd_no();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_cd.equalsIgnoreCase(name)) {
			rcv_cd(value);
			return;
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			rcv_nm(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_schd_no.equalsIgnoreCase(name)) {
			rcv_schd_no(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_cd.equalsIgnoreCase(name)) {
			rcv_cd(value);
			return;
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			rcv_nm(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_schd_no.equalsIgnoreCase(name)) {
			rcv_schd_no(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcv_schd_amt_p.equalsIgnoreCase(name)) {
			return rcv_schd_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcv_schd_amt_p.equalsIgnoreCase(name)) {
			rcv_schd_amt_p(
				((MCContainerMeta) rcv_schd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public MCNumber rcv_schd_amt() {
		return rcv_schd_amt_p().amt();
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(MCNumber value) {
		rcv_schd_amt_p().amt(value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(int value) {
		rcv_schd_amt_p().amt(value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(long value) {
		rcv_schd_amt_p().amt(value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(float value) {
		rcv_schd_amt_p().amt(value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(double value) {
		rcv_schd_amt_p().amt(value);
	}

}

