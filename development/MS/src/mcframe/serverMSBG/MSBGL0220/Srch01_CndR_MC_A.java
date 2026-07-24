package mcframe.serverMSBG.MSBGL0220;

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
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ar_appl_schd_no = "ar_appl_schd_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
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
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public static final String $inc_otr_slo_flg = "inc_otr_slo_flg";


	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inc_not_bill_flg_META = createCommonMeta($inc_not_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_otr_slo_flg_META = createCommonMeta($inc_otr_slo_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_d_no_META,
			ar_appl_schd_no_META,
			slo_no_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			inc_not_bill_flg_META,
			inc_otr_slo_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 0, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 0, $rcv_act_d_no, value);
	}


	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 1, $ar_appl_schd_no);
	}

	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 1, $ar_appl_schd_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 2, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 2, $slo_no, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 3, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 3, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 4, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 4, $ac_dt_to, value);
	}


	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public boolean inc_not_bill_flg() {
		return getConstBoolean(offset + 5, $inc_not_bill_flg);
	}

	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public void inc_not_bill_flg(boolean value) {
		setConstBoolean(offset + 5, $inc_not_bill_flg, value);
	}


	/**
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public boolean inc_otr_slo_flg() {
		return getConstBoolean(offset + 6, $inc_otr_slo_flg);
	}

	/**
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public void inc_otr_slo_flg(boolean value) {
		setConstBoolean(offset + 6, $inc_otr_slo_flg, value);
	}


	public String getString(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		return super.getString(name);
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
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		return super.getStringNE(name);
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
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
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
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
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

