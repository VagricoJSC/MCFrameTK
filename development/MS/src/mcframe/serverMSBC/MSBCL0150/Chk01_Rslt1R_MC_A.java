package mcframe.serverMSBC.MSBCL0150;

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
 * ブロック"Chk01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_Rslt1R_MC_A extends MCConstRow {

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
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public static final String $sim_mrp_typ = "sim_mrp_typ";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $sim_usr_cd = "sim_usr_cd";
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
	/**
	 * Update date 更新日.<p>
	 *
	 */
	public static final String $upd_dt = "upd_dt";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta peg_no1_META = createCommonMeta($peg_no1, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sim_mrp_typ_META = createCommonMeta($sim_mrp_typ, mcframe.commonMS.meta.MS_META.SIM_MRP_TYP);
	public static final MCMeta sim_usr_cd_META = createCommonMeta($sim_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
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
	public static final MCMeta upd_dt_META = createCommonMeta($upd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk01_Rslt1R> constMetas = new ConstMetaList<Chk01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no1_META,
			data_crud_typ_META,
			sim_mrp_no_META,
			wg_cd_META,
			sim_mrp_typ_META,
			sim_usr_cd_META,
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
			upd_dt_META,
			rtn_sts_typ_META,
			upd_cntr_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$upd_cntr, "U"}	// upd_cntr
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no1, "E"},	// peg_no1
				{$sim_mrp_no, "U"},	// sim_mrp_no
				{$wg_cd, "E"},	// wg_cd
				{$sim_mrp_typ, "E"}	// sim_mrp_typ
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$wg_cd, "MA.MAUAL0010.LgOrMfgWg"},	// wg_cd
				{$sim_usr_cd, "MA.MAUAL0010.Usr"}	// sim_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Chk01_Rslt1R_MC_A(ConstMetaList<? extends Chk01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Rslt1R clone() {
		return (Chk01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Rslt1R createInstance() {
		return (Chk01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Rslt1R getValues(String... names) {
		return (Chk01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public MCNumber peg_no1() {
		return getConstNumber(offset + 0, $peg_no1);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(MCNumber value) {
		setConstNumber(offset + 0, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(int value) {
		setConstNumber(offset + 0, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(long value) {
		setConstNumber(offset + 0, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(float value) {
		setConstNumber(offset + 0, $peg_no1, value);
	}

	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public void peg_no1(double value) {
		setConstNumber(offset + 0, $peg_no1, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 2, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 2, $sim_mrp_no, value);
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String sim_usr_cd() {
		return getConstString(offset + 5, $sim_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void sim_usr_cd(String value) {
		setConstString(offset + 5, $sim_usr_cd, value);
	}


	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public boolean dly_rqmt_flg() {
		return getConstBoolean(offset + 6, $dly_rqmt_flg);
	}

	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public void dly_rqmt_flg(boolean value) {
		setConstBoolean(offset + 6, $dly_rqmt_flg, value);
	}


	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 7, $stk_flg);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 7, $stk_flg, value);
	}


	/**
	 * GR schedule 入庫予定.<p>
	 *
	 */
	public boolean gr_flg() {
		return getConstBoolean(offset + 8, $gr_flg);
	}

	/**
	 * GR schedule 入庫予定.<p>
	 *
	 */
	public void gr_flg(boolean value) {
		setConstBoolean(offset + 8, $gr_flg, value);
	}


	/**
	 * GI schedule (Except shipping schedule) 出庫予定（出荷予定除く）.<p>
	 *
	 */
	public boolean gi_flg() {
		return getConstBoolean(offset + 9, $gi_flg);
	}

	/**
	 * GI schedule (Except shipping schedule) 出庫予定（出荷予定除く）.<p>
	 *
	 */
	public void gi_flg(boolean value) {
		setConstBoolean(offset + 9, $gi_flg, value);
	}


	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public boolean ship_flg() {
		return getConstBoolean(offset + 10, $ship_flg);
	}

	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public void ship_flg(boolean value) {
		setConstBoolean(offset + 10, $ship_flg, value);
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCNumber tree_lvl() {
		return getConstNumber(offset + 11, $tree_lvl);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(MCNumber value) {
		setConstNumber(offset + 11, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(int value) {
		setConstNumber(offset + 11, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(long value) {
		setConstNumber(offset + 11, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(float value) {
		setConstNumber(offset + 11, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(double value) {
		setConstNumber(offset + 11, $tree_lvl, value);
	}


	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public MCDate mrp_proc_dt() {
		return getConstDate(offset + 12, $mrp_proc_dt);
	}

	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public void mrp_proc_dt(MCDate value) {
		setConstDate(offset + 12, $mrp_proc_dt, value);
	}


	/**
	 * Applied 反映済.<p>
	 *
	 */
	public boolean exp_flg() {
		return getConstBoolean(offset + 13, $exp_flg);
	}

	/**
	 * Applied 反映済.<p>
	 *
	 */
	public void exp_flg(boolean value) {
		setConstBoolean(offset + 13, $exp_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String sim_mrp_intr_rmrks() {
		return getConstString(offset + 14, $sim_mrp_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void sim_mrp_intr_rmrks(String value) {
		setConstString(offset + 14, $sim_mrp_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sim_mrp_sub_char1() {
		return getConstString(offset + 15, $sim_mrp_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sim_mrp_sub_char1(String value) {
		setConstString(offset + 15, $sim_mrp_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sim_mrp_sub_char2() {
		return getConstString(offset + 16, $sim_mrp_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sim_mrp_sub_char2(String value) {
		setConstString(offset + 16, $sim_mrp_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sim_mrp_sub_char3() {
		return getConstString(offset + 17, $sim_mrp_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sim_mrp_sub_char3(String value) {
		setConstString(offset + 17, $sim_mrp_sub_char3, value);
	}


	/**
	 * Update date 更新日.<p>
	 *
	 */
	public MCDate upd_dt() {
		return getConstDate(offset + 18, $upd_dt);
	}

	/**
	 * Update date 更新日.<p>
	 *
	 */
	public void upd_dt(MCDate value) {
		setConstDate(offset + 18, $upd_dt, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 19, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 19, $rtn_sts_typ, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 20, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 21, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 21, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			return sim_usr_cd();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			return peg_no1();
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			return tree_lvl();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			return mrp_proc_dt();
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			return sim_usr_cd();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			return peg_no1();
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			return tree_lvl();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			return mrp_proc_dt();
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			sim_usr_cd(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			mrp_proc_dt(value);
			return;
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			sim_usr_cd(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no1.equalsIgnoreCase(name)) {
			peg_no1(value);
			return;
		}
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			mrp_proc_dt(value);
			return;
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

