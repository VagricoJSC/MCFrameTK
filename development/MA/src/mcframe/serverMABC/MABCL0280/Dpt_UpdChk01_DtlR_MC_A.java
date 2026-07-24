package mcframe.serverMABC.MABCL0280;

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
 * ブロック"Dpt_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dpt_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_DPT_R {

	/**
	 * Dept. cd_[Before change] 部門ＣＤ_[変更前].<p>
	 *
	 */
	public static final String $dpt_cd_key = "dpt_cd_key";
	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public static final String $lg_flg = "lg_flg";
	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public static final String $ar_flg = "ar_flg";
	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public static final String $ap_flg = "ap_flg";
	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public static final String $sd_flg = "sd_flg";
	/**
	 * Recording month 計上月度.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";


	public static final MCMeta dpt_cd_key_META = createCommonMeta($dpt_cd_key, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_flg_META = createCommonMeta($lg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_flg_META = createCommonMeta($ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_flg_META = createCommonMeta($ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_flg_META = createCommonMeta($sd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<Dpt_UpdChk01_DtlR> constMetas = new ConstMetaList<Dpt_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_DPT_R.constMetas,
		new MCMeta[]{
			dpt_cd_key_META,
			st_dt_key_META,
			sls_flg_META,
			lg_flg_META,
			mfg_flg_META,
			purc_flg_META,
			ar_flg_META,
			ap_flg_META,
			sd_flg_META,
			ac_ym_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dpt_cd, "E"},	// dpt_cd
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"},	// end_dt
				{$dpt_nm, "E"},	// dpt_nm
				{$dpt_lvl_cd, "E"},	// dpt_lvl_cd
				{$addr1, "E"}	// addr1
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E:BF"},	// st_dt
				{$end_dt, "E:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$dpt_cd, "key"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$dpt_lvl_cd, "MA.MAUAL0010.DptLvl"},	// dpt_lvl_cd
				{$up_lv_dpt_cd, "MA.MAUAL0010.DptBase"},	// up_lv_dpt_cd
				{$new_dpt_cd, "MA.MAUAL0010.DptBase"},	// new_dpt_cd
				{$wg_cd, "MA.MAUAL0010.Wg"},	// wg_cd
				{$rcv_bank_ac_cd, "MA.MAUAL0010.BankAc"},	// rcv_bank_ac_cd
				{$pay_bank_ac_cd, "MA.MAUAL0010.BankAc"},	// pay_bank_ac_cd
				{$cal_cd, "MA.MAUAL0010.CalBase"},	// cal_cd
				{$cost_dpt_cd, "MA.MAUAL0010.CostDpt"},	// cost_dpt_cd
				{$ac_dpt_cd, "MA.MAUAL0010.AcDpt"}	// ac_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cost_dpt_cd, "ac_ym"},	// cost_dpt_cd
				{$ac_dpt_cd, "st_dt"}	// ac_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cost_dpt_cd, "ym"},	// cost_dpt_cd
				{$ac_dpt_cd, "dt"}	// ac_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$wg_cd, "sls_flg;lg_flg;mfg_flg;purc_flg;ar_flg;ap_flg;sd_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "sls_flg;lg_flg;mfg_flg;purc_flg;ar_flg;ap_flg;sd_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$zip_cd, "ZIP"},	// zip_cd
				{$tel, "TEL"},	// tel
				{$fax, "TEL"}	// fax
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
	protected Dpt_UpdChk01_DtlR_MC_A(ConstMetaList<? extends Dpt_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dpt_UpdChk01_DtlR clone() {
		return (Dpt_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dpt_UpdChk01_DtlR createInstance() {
		return (Dpt_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dpt_UpdChk01_DtlR getValues(String... names) {
		return (Dpt_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Dept. cd_[Before change] 部門ＣＤ_[変更前].<p>
	 *
	 */
	public String dpt_cd_key() {
		return getConstString(offset + 0, $dpt_cd_key);
	}

	/**
	 * Dept. cd_[Before change] 部門ＣＤ_[変更前].<p>
	 *
	 */
	public void dpt_cd_key(String value) {
		setConstString(offset + 0, $dpt_cd_key, value);
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 1, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 1, $st_dt_key, value);
	}


	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 2, $sls_flg);
	}

	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 2, $sls_flg, value);
	}


	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public boolean lg_flg() {
		return getConstBoolean(offset + 3, $lg_flg);
	}

	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public void lg_flg(boolean value) {
		setConstBoolean(offset + 3, $lg_flg, value);
	}


	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 4, $mfg_flg);
	}

	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 4, $mfg_flg, value);
	}


	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 5, $purc_flg);
	}

	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_flg, value);
	}


	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public boolean ar_flg() {
		return getConstBoolean(offset + 6, $ar_flg);
	}

	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public void ar_flg(boolean value) {
		setConstBoolean(offset + 6, $ar_flg, value);
	}


	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public boolean ap_flg() {
		return getConstBoolean(offset + 7, $ap_flg);
	}

	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public void ap_flg(boolean value) {
		setConstBoolean(offset + 7, $ap_flg, value);
	}


	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public boolean sd_flg() {
		return getConstBoolean(offset + 8, $sd_flg);
	}

	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public void sd_flg(boolean value) {
		setConstBoolean(offset + 8, $sd_flg, value);
	}


	/**
	 * Recording month 計上月度.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 9, $ac_ym);
	}

	/**
	 * Recording month 計上月度.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 9, $ac_ym, value);
	}


	public String getString(String name) {
		if ($dpt_cd_key.equalsIgnoreCase(name)) {
			return dpt_cd_key();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd_key.equalsIgnoreCase(name)) {
			return dpt_cd_key();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd_key.equalsIgnoreCase(name)) {
			dpt_cd_key(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd_key.equalsIgnoreCase(name)) {
			dpt_cd_key(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

