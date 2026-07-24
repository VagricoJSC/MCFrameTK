package mcframe.clientMSBC.MSBCP0150;

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
 * ブロック"RsltSim"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltSimR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
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
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public static final String $sim_mrp_typ = "sim_mrp_typ";
	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public static final String $sim_mrp_typ_nm = "sim_mrp_typ_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $sim_usr_cd = "sim_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $sim_usr_nm = "sim_usr_nm";
	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public static final String $dly_rqmt_flg = "dly_rqmt_flg";
	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	/**
	 * GR schedule 入庫予定.<p>
	 *
	 */
	public static final String $gr_flg = "gr_flg";
	/**
	 * GI schedule (Except shipping schedule) 出庫予定（出荷予定除く）.<p>
	 *
	 */
	public static final String $gi_flg = "gi_flg";
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public static final String $ship_flg = "ship_flg";
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public static final String $tree_lvl = "tree_lvl";
	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public static final String $mrp_proc_dt = "mrp_proc_dt";
	/**
	 * Applied 反映済.<p>
	 *
	 */
	public static final String $exp_flg = "exp_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $sim_mrp_intr_rmrks = "sim_mrp_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sim_mrp_sub_char1 = "sim_mrp_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sim_mrp_sub_char2 = "sim_mrp_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sim_mrp_sub_char3 = "sim_mrp_sub_char3";
	public static final String $rts_msg_p = "rts_msg_p";
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public static final String $peg_no1 = "peg_no1";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";

	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sim_mrp_typ_META = createCommonMeta($sim_mrp_typ, mcframe.commonMS.meta.MS_META.SIM_MRP_TYP);
	public static final MCMeta sim_mrp_typ_nm_META = createCommonMeta($sim_mrp_typ_nm, mcframe.commonMS.meta.MS_META.SIM_MRP_TYP_NM);
	public static final MCMeta sim_usr_cd_META = createCommonMeta($sim_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta sim_usr_nm_META = createCommonMeta($sim_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dly_rqmt_flg_META = createCommonMeta($dly_rqmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_flg_META = createCommonMeta($gr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_flg_META = createCommonMeta($gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_flg_META = createCommonMeta($ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tree_lvl_META = createCommonMeta($tree_lvl, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta mrp_proc_dt_META = createCommonMeta($mrp_proc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta exp_flg_META = createCommonMeta($exp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_mrp_intr_rmrks_META = createCommonMeta($sim_mrp_intr_rmrks, mcframe.commonMS.meta.MS_META.SIM_MRP_INTR_RMRKS);
	public static final MCMeta sim_mrp_sub_char1_META = createCommonMeta($sim_mrp_sub_char1, mcframe.commonMS.meta.MS_META.SIM_MRP_SUB_CHAR1);
	public static final MCMeta sim_mrp_sub_char2_META = createCommonMeta($sim_mrp_sub_char2, mcframe.commonMS.meta.MS_META.SIM_MRP_SUB_CHAR2);
	public static final MCMeta sim_mrp_sub_char3_META = createCommonMeta($sim_mrp_sub_char3, mcframe.commonMS.meta.MS_META.SIM_MRP_SUB_CHAR3);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta peg_no1_META = createCommonMeta($peg_no1, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);

	protected static final ConstMetaList<RsltSimR> constMetas = new ConstMetaList<RsltSimR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			sim_mrp_no_META,
			wg_cd_META,
			wg_nm_META,
			sim_mrp_typ_META,
			sim_mrp_typ_nm_META,
			sim_usr_cd_META,
			sim_usr_nm_META,
			dly_rqmt_flg_META,
			stk_flg_META,
			gr_flg_META,
			gi_flg_META,
			ship_flg_META,
			tree_lvl_META,
			mrp_proc_dt_META,
			exp_flg_META,
			sim_mrp_intr_rmrks_META,
			sim_mrp_sub_char1_META,
			sim_mrp_sub_char2_META,
			sim_mrp_sub_char3_META,
			rts_msg_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META,
			peg_no1_META,
			data_crud_typ_META
		},
		new String[][]{
			{
				"rtn_sts_typ"
			},
			{
				$rtn_sts_typ
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
				{$sim_usr_cd, "usr_nm"}	// sim_usr_cd
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
	protected RsltSimR_MC_A(ConstMetaList<? extends RsltSimR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSimR clone() {
		return (RsltSimR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSimR createInstance() {
		return (RsltSimR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSimR getValues(String... names) {
		return (RsltSimR) super.getValues(names);
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
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 1, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 1, $sim_mrp_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public String sim_mrp_typ() {
		return getConstString(offset + 4, $sim_mrp_typ);
	}

	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public void sim_mrp_typ(String value) {
		setConstString(offset + 4, $sim_mrp_typ, value);
	}


	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public String sim_mrp_typ_nm() {
		return getConstString(offset + 5, $sim_mrp_typ_nm);
	}

	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public void sim_mrp_typ_nm(String value) {
		setConstString(offset + 5, $sim_mrp_typ_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String sim_usr_cd() {
		return getConstString(offset + 6, $sim_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void sim_usr_cd(String value) {
		setConstString(offset + 6, $sim_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String sim_usr_nm() {
		return getConstString(offset + 7, $sim_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void sim_usr_nm(String value) {
		setConstString(offset + 7, $sim_usr_nm, value);
	}


	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public boolean dly_rqmt_flg() {
		return getConstBoolean(offset + 8, $dly_rqmt_flg);
	}

	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public void dly_rqmt_flg(boolean value) {
		setConstBoolean(offset + 8, $dly_rqmt_flg, value);
	}


	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 9, $stk_flg);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 9, $stk_flg, value);
	}


	/**
	 * GR schedule 入庫予定.<p>
	 *
	 */
	public boolean gr_flg() {
		return getConstBoolean(offset + 10, $gr_flg);
	}

	/**
	 * GR schedule 入庫予定.<p>
	 *
	 */
	public void gr_flg(boolean value) {
		setConstBoolean(offset + 10, $gr_flg, value);
	}


	/**
	 * GI schedule (Except shipping schedule) 出庫予定（出荷予定除く）.<p>
	 *
	 */
	public boolean gi_flg() {
		return getConstBoolean(offset + 11, $gi_flg);
	}

	/**
	 * GI schedule (Except shipping schedule) 出庫予定（出荷予定除く）.<p>
	 *
	 */
	public void gi_flg(boolean value) {
		setConstBoolean(offset + 11, $gi_flg, value);
	}


	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public boolean ship_flg() {
		return getConstBoolean(offset + 12, $ship_flg);
	}

	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public void ship_flg(boolean value) {
		setConstBoolean(offset + 12, $ship_flg, value);
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCNumber tree_lvl() {
		return getConstNumber(offset + 13, $tree_lvl);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(MCNumber value) {
		setConstNumber(offset + 13, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(int value) {
		setConstNumber(offset + 13, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(long value) {
		setConstNumber(offset + 13, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(float value) {
		setConstNumber(offset + 13, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(double value) {
		setConstNumber(offset + 13, $tree_lvl, value);
	}


	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public MCDate mrp_proc_dt() {
		return getConstDate(offset + 14, $mrp_proc_dt);
	}

	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public void mrp_proc_dt(MCDate value) {
		setConstDate(offset + 14, $mrp_proc_dt, value);
	}


	/**
	 * Applied 反映済.<p>
	 *
	 */
	public boolean exp_flg() {
		return getConstBoolean(offset + 15, $exp_flg);
	}

	/**
	 * Applied 反映済.<p>
	 *
	 */
	public void exp_flg(boolean value) {
		setConstBoolean(offset + 15, $exp_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String sim_mrp_intr_rmrks() {
		return getConstString(offset + 16, $sim_mrp_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void sim_mrp_intr_rmrks(String value) {
		setConstString(offset + 16, $sim_mrp_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sim_mrp_sub_char1() {
		return getConstString(offset + 17, $sim_mrp_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sim_mrp_sub_char1(String value) {
		setConstString(offset + 17, $sim_mrp_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sim_mrp_sub_char2() {
		return getConstString(offset + 18, $sim_mrp_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sim_mrp_sub_char2(String value) {
		setConstString(offset + 18, $sim_mrp_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sim_mrp_sub_char3() {
		return getConstString(offset + 19, $sim_mrp_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sim_mrp_sub_char3(String value) {
		setConstString(offset + 19, $sim_mrp_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 20, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 20, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 21, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 21, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 22, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 22, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 23, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 23, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 24, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 24, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 26, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 26, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 27, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 27, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 28, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 28, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 29, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 29, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 31, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 31, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 32, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}


	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public MCNumber peg_no1() {
		return getConstNumber(offset + 33, $peg_no1);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(MCNumber value) {
		setConstNumber(offset + 33, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(int value) {
		setConstNumber(offset + 33, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(long value) {
		setConstNumber(offset + 33, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(float value) {
		setConstNumber(offset + 33, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(double value) {
		setConstNumber(offset + 33, $peg_no1, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 34, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 34, $data_crud_typ, value);
	}


	public String getString(String name) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			return sim_mrp_typ_nm();
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			return sim_usr_cd();
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			return sim_usr_nm();
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			return sim_mrp_intr_rmrks();
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char1();
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char2();
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char3();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			return tree_lvl();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			return peg_no1();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			return mrp_proc_dt();
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
		if ($dly_rqmt_flg.equalsIgnoreCase(name)) {
			return dly_rqmt_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($gr_flg.equalsIgnoreCase(name)) {
			return gr_flg();
		}
		if ($gi_flg.equalsIgnoreCase(name)) {
			return gi_flg();
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			return ship_flg();
		}
		if ($exp_flg.equalsIgnoreCase(name)) {
			return exp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			return sim_mrp_typ_nm();
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			return sim_usr_cd();
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			return sim_usr_nm();
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			return sim_mrp_intr_rmrks();
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char1();
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char2();
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char3();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			return tree_lvl();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			return peg_no1();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			return mrp_proc_dt();
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
		if ($dly_rqmt_flg.equalsIgnoreCase(name)) {
			return dly_rqmt_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($gr_flg.equalsIgnoreCase(name)) {
			return gr_flg();
		}
		if ($gi_flg.equalsIgnoreCase(name)) {
			return gi_flg();
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			return ship_flg();
		}
		if ($exp_flg.equalsIgnoreCase(name)) {
			return exp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			sim_mrp_typ_nm(value);
			return;
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			sim_usr_cd(value);
			return;
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			sim_usr_nm(value);
			return;
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			sim_mrp_intr_rmrks(value);
			return;
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			sim_mrp_sub_char1(value);
			return;
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			sim_mrp_sub_char2(value);
			return;
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			sim_mrp_sub_char3(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			mrp_proc_dt(value);
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
		if ($dly_rqmt_flg.equalsIgnoreCase(name)) {
			dly_rqmt_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($gr_flg.equalsIgnoreCase(name)) {
			gr_flg(value);
			return;
		}
		if ($gi_flg.equalsIgnoreCase(name)) {
			gi_flg(value);
			return;
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			ship_flg(value);
			return;
		}
		if ($exp_flg.equalsIgnoreCase(name)) {
			exp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			sim_mrp_typ_nm(value);
			return;
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			sim_usr_cd(value);
			return;
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			sim_usr_nm(value);
			return;
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			sim_mrp_intr_rmrks(value);
			return;
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			sim_mrp_sub_char1(value);
			return;
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			sim_mrp_sub_char2(value);
			return;
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			sim_mrp_sub_char3(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			mrp_proc_dt(value);
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
		if ($dly_rqmt_flg.equalsIgnoreCase(name)) {
			dly_rqmt_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($gr_flg.equalsIgnoreCase(name)) {
			gr_flg(value);
			return;
		}
		if ($gi_flg.equalsIgnoreCase(name)) {
			gi_flg(value);
			return;
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			ship_flg(value);
			return;
		}
		if ($exp_flg.equalsIgnoreCase(name)) {
			exp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

