package mcframe.serverMSBH.MSBHL0090;

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
 * ブロック"Srch02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_CndR_MC_A extends MCConstRow {

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public static final String $pay_act_dt = "pay_act_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public static final String $pay_act_seq = "pay_act_seq";
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_cd = "setoff_cd";
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public static final String $setoff_nm = "setoff_nm";
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public static final String $so_dpt_cd = "so_dpt_cd";
	/**
	 * Filter by payment dept. 支払部門で絞り込む.<p>
	 *
	 */
	public static final String $pay_dpt_narrow_down_flg = "pay_dpt_narrow_down_flg";
	/**
	 * Filter by the AP settlement method 債務決済方法で絞り込む.<p>
	 *
	 */
	public static final String $ap_sttl_narrow_down_flg = "ap_sttl_narrow_down_flg";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";


	public static final MCMeta pay_act_dt_META = createCommonMeta($pay_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_narrow_down_flg_META = createCommonMeta($pay_dpt_narrow_down_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_narrow_down_flg_META = createCommonMeta($ap_sttl_narrow_down_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Srch02_CndR> constMetas = new ConstMetaList<Srch02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_act_dt_META,
			ac_dt_META,
			pay_act_no_META,
			pay_act_seq_META,
			pay_dpt_cd_META,
			psppl_cd_META,
			trd_cur_cd_META,
			ap_sttl_cd_META,
			ap_sttl_typ_META,
			bank_ac_cd_META,
			pay_bank_ac_cd_META,
			ap_setoff_typ_META,
			setoff_cd_META,
			setoff_nm_META,
			so_dpt_cd_META,
			pay_dpt_narrow_down_flg_META,
			ap_sttl_narrow_down_flg_META,
			pay_schd_dt_META
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
	protected Srch02_CndR_MC_A(ConstMetaList<? extends Srch02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR clone() {
		return (Srch02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR createInstance() {
		return (Srch02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR getValues(String... names) {
		return (Srch02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return getConstDate(offset + 0, $pay_act_dt);
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		setConstDate(offset + 0, $pay_act_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 1, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 1, $ac_dt, value);
	}


	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 2, $pay_act_no);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 2, $pay_act_no, value);
	}


	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return getConstNumber(offset + 3, $pay_act_seq);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(int value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(long value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(float value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(double value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 4, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 4, $pay_dpt_cd, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 5, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 5, $psppl_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 6, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 6, $trd_cur_cd, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 7, $ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 7, $ap_sttl_cd, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 8, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 8, $ap_sttl_typ, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 9, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 9, $bank_ac_cd, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 10, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 10, $pay_bank_ac_cd, value);
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 11, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 11, $ap_setoff_typ, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 12, $setoff_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 12, $setoff_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 13, $setoff_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 13, $setoff_nm, value);
	}


	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 14, $so_dpt_cd);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 14, $so_dpt_cd, value);
	}


	/**
	 * Filter by payment dept. 支払部門で絞り込む.<p>
	 *
	 */
	public boolean pay_dpt_narrow_down_flg() {
		return getConstBoolean(offset + 15, $pay_dpt_narrow_down_flg);
	}

	/**
	 * Filter by payment dept. 支払部門で絞り込む.<p>
	 *
	 */
	public void pay_dpt_narrow_down_flg(boolean value) {
		setConstBoolean(offset + 15, $pay_dpt_narrow_down_flg, value);
	}


	/**
	 * Filter by the AP settlement method 債務決済方法で絞り込む.<p>
	 *
	 */
	public boolean ap_sttl_narrow_down_flg() {
		return getConstBoolean(offset + 16, $ap_sttl_narrow_down_flg);
	}

	/**
	 * Filter by the AP settlement method 債務決済方法で絞り込む.<p>
	 *
	 */
	public void ap_sttl_narrow_down_flg(boolean value) {
		setConstBoolean(offset + 16, $ap_sttl_narrow_down_flg, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 17, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 17, $pay_schd_dt, value);
	}


	public String getString(String name) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pay_dpt_narrow_down_flg.equalsIgnoreCase(name)) {
			return pay_dpt_narrow_down_flg();
		}
		if ($ap_sttl_narrow_down_flg.equalsIgnoreCase(name)) {
			return ap_sttl_narrow_down_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pay_dpt_narrow_down_flg.equalsIgnoreCase(name)) {
			return pay_dpt_narrow_down_flg();
		}
		if ($ap_sttl_narrow_down_flg.equalsIgnoreCase(name)) {
			return ap_sttl_narrow_down_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pay_dpt_narrow_down_flg.equalsIgnoreCase(name)) {
			pay_dpt_narrow_down_flg(value);
			return;
		}
		if ($ap_sttl_narrow_down_flg.equalsIgnoreCase(name)) {
			ap_sttl_narrow_down_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pay_dpt_narrow_down_flg.equalsIgnoreCase(name)) {
			pay_dpt_narrow_down_flg(value);
			return;
		}
		if ($ap_sttl_narrow_down_flg.equalsIgnoreCase(name)) {
			ap_sttl_narrow_down_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

