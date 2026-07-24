package mcframe.clientMSBB.MSBBP1390;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public static final String $sls_itm_grp_nm = "sls_itm_grp_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	public static final String $WrkNo_p = "WrkNo_p";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public static final String $sls_bdg_grp = "sls_bdg_grp";
	public static final String $SlsAmt_p = "SlsAmt_p";
	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public static final String $bdg_sls_prof_rate = "bdg_sls_prof_rate";
	public static final String $SlsProfAmt_p = "SlsProfAmt_p";
	/**
	 * Not for aggregation 集計対象外.<p>
	 *
	 */
	public static final String $not_sum_flg = "not_sum_flg";
	/**
	 * Not for item system aggregation 品目体系集計対象外.<p>
	 *
	 */
	public static final String $sls_itm_grp_not_sum_flg = "sls_itm_grp_not_sum_flg";
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
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $BpGrp_p = "BpGrp_p";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $sls_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $sls_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $sls_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $sls_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $wrk_no = $WrkNo_p + ".wrk_no";
	public static final String $wrk_nm = $WrkNo_p + ".wrk_nm";
	public static final String $bdg_sls_amt = $SlsAmt_p + ".amt";
	public static final String $bdg_sls_prof_amt = $SlsProfAmt_p + ".amt";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $bp_grp_cd1 = $BpGrp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $BpGrp_p + ".bp_grp_nm1";
	public static final String $bp_grp_cd2 = $BpGrp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $BpGrp_p + ".bp_grp_nm2";
	public static final String $bp_grp_cd3 = $BpGrp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $BpGrp_p + ".bp_grp_nm3";
	public static final String $bp_grp_cd4 = $BpGrp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $BpGrp_p + ".bp_grp_nm4";
	public static final String $bp_grp_cd5 = $BpGrp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $BpGrp_p + ".bp_grp_nm5";
	public static final String $bp_grp_cd6 = $BpGrp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $BpGrp_p + ".bp_grp_nm6";
	public static final String $bp_grp_cd7 = $BpGrp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $BpGrp_p + ".bp_grp_nm7";
	public static final String $bp_grp_cd8 = $BpGrp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $BpGrp_p + ".bp_grp_nm8";
	public static final String $bp_grp_cd9 = $BpGrp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $BpGrp_p + ".bp_grp_nm9";
	public static final String $bp_grp_cd10 = $BpGrp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $BpGrp_p + ".bp_grp_nm10";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta sls_itm_grp_nm_META = createCommonMeta($sls_itm_grp_nm, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta WrkNo_p_META = createInnerRowMeta($WrkNo_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sls_bdg_grp_META = createCommonMeta($sls_bdg_grp, mcframe.commonMS.meta.MS_META.SLS_BDG_GRP);
	public static final MCMeta SlsAmt_p_META = createInnerRowMeta($SlsAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bdg_sls_prof_rate_META = createCommonMeta($bdg_sls_prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta SlsProfAmt_p_META = createInnerRowMeta($SlsProfAmt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta not_sum_flg_META = createCommonMeta($not_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_itm_grp_not_sum_flg_META = createCommonMeta($sls_itm_grp_not_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_BDG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_BDG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_BDG_SUB_CHAR3);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta BpGrp_p_META = createInnerRowMeta($BpGrp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			ym_META,
			usr_dpt_p_META,
			wg_cd_META,
			wg_nm_META,
			sls_itm_grp_cd_META,
			sls_itm_grp_nm_META,
			cst_cd_META,
			cst_nm_META,
			WrkNo_p_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			sls_bdg_grp_META,
			SlsAmt_p_META,
			bdg_sls_prof_rate_META,
			SlsProfAmt_p_META,
			not_sum_flg_META,
			sls_itm_grp_not_sum_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rts_msg_p_META,
			BpGrp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"sls_usr_cd",
				"sls_usr_nm",
				"sls_dpt_cd",
				"sls_dpt_nm",
				"wrk_no",
				"wrk_nm",
				"bdg_sls_amt",
				"bdg_sls_prof_amt",
				"rtn_sts_typ",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$sls_usr_cd,
				$sls_usr_nm,
				$sls_dpt_cd,
				$sls_dpt_nm,
				$wrk_no,
				$wrk_nm,
				$bdg_sls_amt,
				$bdg_sls_prof_amt,
				$rtn_sts_typ,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_cd10,
				$bp_grp_nm10
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$ym,	// ym
			$usr_dpt_p + ".usr_cd",	// usr_dpt_p.usr_cd
			$usr_dpt_p + ".dpt_cd",	// usr_dpt_p.dpt_cd
			$wg_cd,	// wg_cd
			$sls_itm_grp_cd,	// sls_itm_grp_cd
			$cst_cd,	// cst_cd
			$WrkNo_p + ".wrk_no",	// WrkNo_p.wrk_no
			$trd_cur_cd,	// trd_cur_cd
			$sls_bdg_grp	// sls_bdg_grp
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd"},	// usr_dpt_p.dpt_cd
				{$cst_cd, "bp_nm"},	// cst_cd
				{$trd_cur_cd, "cur_nm;amt_dec_place"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.SLS;ym;sls_usr_cd"},	// usr_dpt_p.dpt_cd
				{$wg_cd, "true"},	// wg_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"},	// usr_dpt_p.dpt_cd
				{$wg_cd, "wr_flg"},	// wg_cd
				{$cst_cd, "bp_is_srch_typ"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 1, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 1, $ym, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 2, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 2, $usr_dpt_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 5, $sls_itm_grp_cd);
	}

	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 5, $sls_itm_grp_cd, value);
	}


	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public String sls_itm_grp_nm() {
		return getConstString(offset + 6, $sls_itm_grp_nm);
	}

	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public void sls_itm_grp_nm(String value) {
		setConstString(offset + 6, $sls_itm_grp_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 7, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 7, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 8, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 8, $cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR WrkNo_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 9, $WrkNo_p);
	}
	
	public void WrkNo_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 9, $WrkNo_p, row);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 10, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 10, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 11, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 11, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 12, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 12, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 12, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 12, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 12, $amt_dec_place, value);
	}


	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public String sls_bdg_grp() {
		return getConstString(offset + 13, $sls_bdg_grp);
	}

	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public void sls_bdg_grp(String value) {
		setConstString(offset + 13, $sls_bdg_grp, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR SlsAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 14, $SlsAmt_p);
	}
	
	public void SlsAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 14, $SlsAmt_p, row);
	}


	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public MCNumber bdg_sls_prof_rate() {
		return getConstNumber(offset + 15, $bdg_sls_prof_rate);
	}

	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(MCNumber value) {
		setConstNumber(offset + 15, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(int value) {
		setConstNumber(offset + 15, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(long value) {
		setConstNumber(offset + 15, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(float value) {
		setConstNumber(offset + 15, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(double value) {
		setConstNumber(offset + 15, $bdg_sls_prof_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR SlsProfAmt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 16, $SlsProfAmt_p);
	}
	
	public void SlsProfAmt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 16, $SlsProfAmt_p, row);
	}


	/**
	 * Not for aggregation 集計対象外.<p>
	 *
	 */
	public boolean not_sum_flg() {
		return getConstBoolean(offset + 17, $not_sum_flg);
	}

	/**
	 * Not for aggregation 集計対象外.<p>
	 *
	 */
	public void not_sum_flg(boolean value) {
		setConstBoolean(offset + 17, $not_sum_flg, value);
	}


	/**
	 * Not for item system aggregation 品目体系集計対象外.<p>
	 *
	 */
	public boolean sls_itm_grp_not_sum_flg() {
		return getConstBoolean(offset + 18, $sls_itm_grp_not_sum_flg);
	}

	/**
	 * Not for item system aggregation 品目体系集計対象外.<p>
	 *
	 */
	public void sls_itm_grp_not_sum_flg(boolean value) {
		setConstBoolean(offset + 18, $sls_itm_grp_not_sum_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 19, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 19, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 20, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 20, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 21, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 21, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 22, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 22, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR BpGrp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 23, $BpGrp_p);
	}
	
	public void BpGrp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 23, $BpGrp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 24, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 24, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 25, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 25, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 27, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 27, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 29, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 30, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 30, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 31, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 31, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 32, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 32, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 33, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 33, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 35, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 35, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			return sls_bdg_grp();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			return bdg_sls_prof_rate();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			return not_sum_flg();
		}
		if ($sls_itm_grp_not_sum_flg.equalsIgnoreCase(name)) {
			return sls_itm_grp_not_sum_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			return sls_bdg_grp();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			return bdg_sls_prof_rate();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			return not_sum_flg();
		}
		if ($sls_itm_grp_not_sum_flg.equalsIgnoreCase(name)) {
			return sls_itm_grp_not_sum_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			sls_bdg_grp(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			not_sum_flg(value);
			return;
		}
		if ($sls_itm_grp_not_sum_flg.equalsIgnoreCase(name)) {
			sls_itm_grp_not_sum_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			sls_bdg_grp(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			not_sum_flg(value);
			return;
		}
		if ($sls_itm_grp_not_sum_flg.equalsIgnoreCase(name)) {
			sls_itm_grp_not_sum_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($WrkNo_p.equalsIgnoreCase(name)) {
			return WrkNo_p();
		}
		if ($SlsAmt_p.equalsIgnoreCase(name)) {
			return SlsAmt_p();
		}
		if ($SlsProfAmt_p.equalsIgnoreCase(name)) {
			return SlsProfAmt_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($BpGrp_p.equalsIgnoreCase(name)) {
			return BpGrp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($WrkNo_p.equalsIgnoreCase(name)) {
			WrkNo_p(
				((MCContainerMeta) WrkNo_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		if ($SlsAmt_p.equalsIgnoreCase(name)) {
			SlsAmt_p(
				((MCContainerMeta) SlsAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($SlsProfAmt_p.equalsIgnoreCase(name)) {
			SlsProfAmt_p(
				((MCContainerMeta) SlsProfAmt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($BpGrp_p.equalsIgnoreCase(name)) {
			BpGrp_p(
				((MCContainerMeta) BpGrp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	public String wrk_no() {
		return WrkNo_p().wrk_no();
	}

	public void wrk_no(String value) {
		WrkNo_p().wrk_no(value);
	}

	public String wrk_nm() {
		return WrkNo_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		WrkNo_p().wrk_nm(value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public MCNumber bdg_sls_amt() {
		return SlsAmt_p().amt();
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(MCNumber value) {
		SlsAmt_p().amt(value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(int value) {
		SlsAmt_p().amt(value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(long value) {
		SlsAmt_p().amt(value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(float value) {
		SlsAmt_p().amt(value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(double value) {
		SlsAmt_p().amt(value);
	}

	/**
	 * Budget gross profit 予算粗利金額.<p>
	 *
	 */
	public MCNumber bdg_sls_prof_amt() {
		return SlsProfAmt_p().amt();
	}

	/**
	 * Budget gross profit 予算粗利金額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(MCNumber value) {
		SlsProfAmt_p().amt(value);
	}

	/**
	 * Budget gross profit 予算粗利金額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(int value) {
		SlsProfAmt_p().amt(value);
	}

	/**
	 * Budget gross profit 予算粗利金額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(long value) {
		SlsProfAmt_p().amt(value);
	}

	/**
	 * Budget gross profit 予算粗利金額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(float value) {
		SlsProfAmt_p().amt(value);
	}

	/**
	 * Budget gross profit 予算粗利金額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(double value) {
		SlsProfAmt_p().amt(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return BpGrp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		BpGrp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return BpGrp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		BpGrp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return BpGrp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		BpGrp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return BpGrp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		BpGrp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return BpGrp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		BpGrp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return BpGrp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		BpGrp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return BpGrp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		BpGrp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return BpGrp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		BpGrp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return BpGrp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		BpGrp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return BpGrp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		BpGrp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return BpGrp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		BpGrp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return BpGrp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		BpGrp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return BpGrp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		BpGrp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return BpGrp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		BpGrp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return BpGrp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		BpGrp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return BpGrp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		BpGrp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return BpGrp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		BpGrp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return BpGrp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		BpGrp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return BpGrp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		BpGrp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return BpGrp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		BpGrp_p().bp_grp_nm10(value);
	}

}

