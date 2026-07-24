package mcframe.clientMSBC.MSBCP1130;

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
 * ブロック"ActBulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ActBulkSetR_MC_A extends MCConstRow {

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";
	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public static final String $st_act_dt = "st_act_dt";
	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public static final String $end_act_dt = "end_act_dt";
	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public static final String $act_immed_prnt_flg = "act_immed_prnt_flg";
	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public static final String $not_bkf_upd_flg = "not_bkf_upd_flg";
	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public static final String $not_wk_cost_upd_calc_flg = "not_wk_cost_upd_calc_flg";
	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	public static final String $act_usr_dpt_p = "act_usr_dpt_p";
	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public static final String $async_flg = "async_flg";

	public static final String $act_usr_cd = $act_usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $act_usr_dpt_p + ".usr_nm";
	public static final String $act_usr_dpt_cd = $act_usr_dpt_p + ".dpt_cd";
	public static final String $act_usr_dpt_nm = $act_usr_dpt_p + ".dpt_nm";

	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta st_act_dt_META = createCommonMeta($st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_dt_META = createCommonMeta($end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_immed_prnt_flg_META = createCommonMeta($act_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_bkf_upd_flg_META = createCommonMeta($not_bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wk_cost_upd_calc_flg_META = createCommonMeta($not_wk_cost_upd_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_usr_dpt_p_META = createInnerRowMeta($act_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta async_flg_META = createCommonMeta($async_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ActBulkSetR> constMetas = new ConstMetaList<ActBulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			st_act_dt_META,
			end_act_dt_META,
			act_immed_prnt_flg_META,
			not_bkf_upd_flg_META,
			not_wk_cost_upd_calc_flg_META,
			oper_unit_flg_META,
			act_usr_dpt_p_META,
			async_flg_META
		},
		new String[][]{
			{
				"act_usr_cd",
				"act_usr_nm",
				"act_usr_dpt_cd",
				"act_usr_dpt_nm"
			},
			{
				$act_usr_cd,
				$act_usr_nm,
				$act_usr_dpt_cd,
				$act_usr_dpt_nm
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
				{$act_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// act_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$act_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.MFG;st_act_dt;act_usr_cd"}	// act_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$act_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"}	// act_usr_dpt_p.dpt_cd
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
	protected ActBulkSetR_MC_A(ConstMetaList<? extends ActBulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActBulkSetR clone() {
		return (ActBulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActBulkSetR createInstance() {
		return (ActBulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActBulkSetR getValues(String... names) {
		return (ActBulkSetR) super.getValues(names);
	}



	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 0, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 0, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 1, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 1, $mfg_sts_typ_nm, value);
	}


	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate st_act_dt() {
		return getConstDate(offset + 2, $st_act_dt);
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void st_act_dt(MCDate value) {
		setConstDate(offset + 2, $st_act_dt, value);
	}


	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate end_act_dt() {
		return getConstDate(offset + 3, $end_act_dt);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void end_act_dt(MCDate value) {
		setConstDate(offset + 3, $end_act_dt, value);
	}


	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public boolean act_immed_prnt_flg() {
		return getConstBoolean(offset + 4, $act_immed_prnt_flg);
	}

	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public void act_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $act_immed_prnt_flg, value);
	}


	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public boolean not_bkf_upd_flg() {
		return getConstBoolean(offset + 5, $not_bkf_upd_flg);
	}

	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public void not_bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 5, $not_bkf_upd_flg, value);
	}


	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public boolean not_wk_cost_upd_calc_flg() {
		return getConstBoolean(offset + 6, $not_wk_cost_upd_calc_flg);
	}

	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public void not_wk_cost_upd_calc_flg(boolean value) {
		setConstBoolean(offset + 6, $not_wk_cost_upd_calc_flg, value);
	}


	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 7, $oper_unit_flg);
	}

	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 7, $oper_unit_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR act_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 8, $act_usr_dpt_p);
	}
	
	public void act_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 8, $act_usr_dpt_p, row);
	}


	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public boolean async_flg() {
		return getConstBoolean(offset + 9, $async_flg);
	}

	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public void async_flg(boolean value) {
		setConstBoolean(offset + 9, $async_flg, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			return st_act_dt();
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			return end_act_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			return act_immed_prnt_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return not_wk_cost_upd_calc_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			return async_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			return st_act_dt();
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			return end_act_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			return act_immed_prnt_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return not_wk_cost_upd_calc_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			return async_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			st_act_dt(value);
			return;
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			end_act_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			act_immed_prnt_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			not_wk_cost_upd_calc_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			async_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			st_act_dt(value);
			return;
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			end_act_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			act_immed_prnt_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			not_wk_cost_upd_calc_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			async_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			return act_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			act_usr_dpt_p(
				((MCContainerMeta) act_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return act_usr_dpt_p().usr_cd();
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		act_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return act_usr_dpt_p().usr_nm();
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		act_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_usr_dpt_cd() {
		return act_usr_dpt_p().dpt_cd();
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_usr_dpt_cd(String value) {
		act_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_usr_dpt_nm() {
		return act_usr_dpt_p().dpt_nm();
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_usr_dpt_nm(String value) {
		act_usr_dpt_p().dpt_nm(value);
	}

}

