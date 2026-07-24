package mcframe.clientMSBE.MSBEP1050;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public static final String $xfr_schd_dt = "xfr_schd_dt";
	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public static final String $xfr_inst_dt = "xfr_inst_dt";
	/**
	 * Actual movement date 移動実績日.<p>
	 *
	 */
	public static final String $xfr_act_dt = "xfr_act_dt";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $inst_usr_dpt_p = "inst_usr_dpt_p";
	public static final String $act_usr_dpt_p = "act_usr_dpt_p";
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public static final String $immd_pick_prnt_flg = "immd_pick_prnt_flg";
	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $immd_inst_prnt_flg = "immd_inst_prnt_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $immd_dlv_prnt_flg = "immd_dlv_prnt_flg";
	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public static final String $indiv_inst_prnt_flg = "indiv_inst_prnt_flg";
	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";
	/**
	 * GI location aggregation 出庫場所まとめ.<p>
	 *
	 */
	public static final String $agg_gi_loc_flg = "agg_gi_loc_flg";

	public static final String $xfr_ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $inst_usr_cd = $inst_usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $inst_usr_dpt_p + ".usr_nm";
	public static final String $inst_dpt_cd = $inst_usr_dpt_p + ".dpt_cd";
	public static final String $inst_dpt_nm = $inst_usr_dpt_p + ".dpt_nm";
	public static final String $act_usr_cd = $act_usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $act_usr_dpt_p + ".usr_nm";
	public static final String $act_dpt_cd = $act_usr_dpt_p + ".dpt_cd";
	public static final String $act_dpt_nm = $act_usr_dpt_p + ".dpt_nm";

	public static final MCMeta xfr_schd_dt_META = createCommonMeta($xfr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_inst_dt_META = createCommonMeta($xfr_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_act_dt_META = createCommonMeta($xfr_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP0310.AcDtR.class);
	public static final MCMeta inst_usr_dpt_p_META = createInnerRowMeta($inst_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta act_usr_dpt_p_META = createInnerRowMeta($act_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta immd_pick_prnt_flg_META = createCommonMeta($immd_pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_inst_prnt_flg_META = createCommonMeta($immd_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_dlv_prnt_flg_META = createCommonMeta($immd_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_inst_prnt_flg_META = createCommonMeta($indiv_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta agg_gi_loc_flg_META = createCommonMeta($agg_gi_loc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfr_schd_dt_META,
			xfr_inst_dt_META,
			xfr_act_dt_META,
			ac_dt_p_META,
			inst_usr_dpt_p_META,
			act_usr_dpt_p_META,
			immd_pick_prnt_flg_META,
			immd_inst_prnt_flg_META,
			immd_dlv_prnt_flg_META,
			indiv_inst_prnt_flg_META,
			indiv_prnt_flg_META,
			agg_gi_loc_flg_META
		},
		new String[][]{
			{
				"xfr_ac_dt",
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_dpt_cd",
				"inst_dpt_nm",
				"act_usr_cd",
				"act_usr_nm",
				"act_dpt_cd",
				"act_dpt_nm"
			},
			{
				$xfr_ac_dt,
				$inst_usr_cd,
				$inst_usr_nm,
				$inst_dpt_cd,
				$inst_dpt_nm,
				$act_usr_cd,
				$act_usr_nm,
				$act_dpt_cd,
				$act_dpt_nm
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
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// inst_usr_dpt_p.dpt_cd
				{$act_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// act_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "xfr_inst_dt;inst_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"},	// inst_usr_dpt_p.dpt_cd
				{$act_usr_dpt_p + ".dpt_cd", "xfr_ac_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"}	// act_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// inst_usr_dpt_p.dpt_cd
				{$act_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// act_usr_dpt_p.dpt_cd
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return getConstDate(offset + 0, $xfr_schd_dt);
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		setConstDate(offset + 0, $xfr_schd_dt, value);
	}


	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public MCDate xfr_inst_dt() {
		return getConstDate(offset + 1, $xfr_inst_dt);
	}

	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public void xfr_inst_dt(MCDate value) {
		setConstDate(offset + 1, $xfr_inst_dt, value);
	}


	/**
	 * Actual movement date 移動実績日.<p>
	 *
	 */
	public MCDate xfr_act_dt() {
		return getConstDate(offset + 2, $xfr_act_dt);
	}

	/**
	 * Actual movement date 移動実績日.<p>
	 *
	 */
	public void xfr_act_dt(MCDate value) {
		setConstDate(offset + 2, $xfr_act_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0310.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0310.AcDtR) getConstInnerRow(offset + 3, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP0310.AcDtR row){
		setConstInnerRow(offset + 3, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR inst_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 4, $inst_usr_dpt_p);
	}
	
	public void inst_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 4, $inst_usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR act_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 5, $act_usr_dpt_p);
	}
	
	public void act_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 5, $act_usr_dpt_p, row);
	}


	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean immd_pick_prnt_flg() {
		return getConstBoolean(offset + 6, $immd_pick_prnt_flg);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void immd_pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $immd_pick_prnt_flg, value);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean immd_inst_prnt_flg() {
		return getConstBoolean(offset + 7, $immd_inst_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void immd_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 7, $immd_inst_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return getConstBoolean(offset + 8, $immd_dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 8, $immd_dlv_prnt_flg, value);
	}


	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public boolean indiv_inst_prnt_flg() {
		return getConstBoolean(offset + 9, $indiv_inst_prnt_flg);
	}

	/**
	 * Individual issue (Order sheet) 個別発行（指図書）.<p>
	 *
	 */
	public void indiv_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 9, $indiv_inst_prnt_flg, value);
	}


	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 10, $indiv_prnt_flg);
	}

	/**
	 * Individual issue (Delivery note) 個別発行（納品書）.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 10, $indiv_prnt_flg, value);
	}


	/**
	 * GI location aggregation 出庫場所まとめ.<p>
	 *
	 */
	public boolean agg_gi_loc_flg() {
		return getConstBoolean(offset + 11, $agg_gi_loc_flg);
	}

	/**
	 * GI location aggregation 出庫場所まとめ.<p>
	 *
	 */
	public void agg_gi_loc_flg(boolean value) {
		setConstBoolean(offset + 11, $agg_gi_loc_flg, value);
	}


	public MCDate getDate(String name) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			return xfr_act_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_inst_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_inst_prnt_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			return agg_gi_loc_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			return xfr_act_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_inst_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_inst_prnt_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			return agg_gi_loc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			xfr_act_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_inst_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			indiv_inst_prnt_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			agg_gi_loc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($xfr_act_dt.equalsIgnoreCase(name)) {
			xfr_act_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_inst_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($indiv_inst_prnt_flg.equalsIgnoreCase(name)) {
			indiv_inst_prnt_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		if ($agg_gi_loc_flg.equalsIgnoreCase(name)) {
			agg_gi_loc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			return inst_usr_dpt_p();
		}
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			return act_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0310.AcDtR.class, value)
			);
			return;
		}
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			inst_usr_dpt_p(
				((MCContainerMeta) inst_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			act_usr_dpt_p(
				((MCContainerMeta) act_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement recording date 移動計上日.<p>
	 *
	 */
	public MCDate xfr_ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Movement recording date 移動計上日.<p>
	 *
	 */
	public void xfr_ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return inst_usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		inst_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return inst_usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		inst_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return inst_usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		inst_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return inst_usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		inst_usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return act_usr_dpt_p().usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		act_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return act_usr_dpt_p().usr_nm();
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		act_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return act_usr_dpt_p().dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		act_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return act_usr_dpt_p().dpt_nm();
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		act_usr_dpt_p().dpt_nm(value);
	}

}

