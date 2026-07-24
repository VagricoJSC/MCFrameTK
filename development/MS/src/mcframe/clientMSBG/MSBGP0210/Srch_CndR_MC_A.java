package mcframe.clientMSBG.MSBGP0210;

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
 * ブロック"Srch_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch_CndR_MC_A extends MCConstRow {

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public static final String $grp_seq = "grp_seq";
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public static final String $inc_not_bill_flg = "inc_not_bill_flg";
	/**
	 * Include other sales orders 他の受注を含む.<p>
	 *
	 */
	public static final String $inc_otr_slo_flg = "inc_otr_slo_flg";
	/**
	 * AR schedule No. 売掛予定ＮＯ.<p>
	 *
	 */
	public static final String $ar_appl_schd_no = "ar_appl_schd_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";


	public static final MCMeta grp_seq_META = createCommonMeta($grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inc_not_bill_flg_META = createCommonMeta($inc_not_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_otr_slo_flg_META = createCommonMeta($inc_otr_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);

	protected static final ConstMetaList<Srch_CndR> constMetas = new ConstMetaList<Srch_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_seq_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			inc_not_bill_flg_META,
			inc_otr_slo_flg_META,
			ar_appl_schd_no_META,
			slo_no_META
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
	protected Srch_CndR_MC_A(ConstMetaList<? extends Srch_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_CndR clone() {
		return (Srch_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_CndR createInstance() {
		return (Srch_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_CndR getValues(String... names) {
		return (Srch_CndR) super.getValues(names);
	}



	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public MCNumber grp_seq() {
		return getConstNumber(offset + 0, $grp_seq);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(MCNumber value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(int value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(long value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(float value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}

	/**
	 * Group sequence No. グループシーケンスＮＯ.<p>
	 *
	 */
	public void grp_seq(double value) {
		setConstNumber(offset + 0, $grp_seq, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 1, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 1, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 2, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 2, $ac_dt_to, value);
	}


	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public boolean inc_not_bill_flg() {
		return getConstBoolean(offset + 3, $inc_not_bill_flg);
	}

	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public void inc_not_bill_flg(boolean value) {
		setConstBoolean(offset + 3, $inc_not_bill_flg, value);
	}


	/**
	 * Include other sales orders 他の受注を含む.<p>
	 *
	 */
	public boolean inc_otr_slo_flg() {
		return getConstBoolean(offset + 4, $inc_otr_slo_flg);
	}

	/**
	 * Include other sales orders 他の受注を含む.<p>
	 *
	 */
	public void inc_otr_slo_flg(boolean value) {
		setConstBoolean(offset + 4, $inc_otr_slo_flg, value);
	}


	/**
	 * AR schedule No. 売掛予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 5, $ar_appl_schd_no);
	}

	/**
	 * AR schedule No. 売掛予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 5, $ar_appl_schd_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 6, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 6, $slo_no, value);
	}


	public String getString(String name) {
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			return inc_not_bill_flg();
		}
		if ($inc_otr_slo_flg.equalsIgnoreCase(name)) {
			return inc_otr_slo_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			return grp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			return inc_not_bill_flg();
		}
		if ($inc_otr_slo_flg.equalsIgnoreCase(name)) {
			return inc_otr_slo_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			inc_not_bill_flg(value);
			return;
		}
		if ($inc_otr_slo_flg.equalsIgnoreCase(name)) {
			inc_otr_slo_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_seq.equalsIgnoreCase(name)) {
			grp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			inc_not_bill_flg(value);
			return;
		}
		if ($inc_otr_slo_flg.equalsIgnoreCase(name)) {
			inc_otr_slo_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

