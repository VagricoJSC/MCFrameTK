package mcframe.serverMSBD.MSBDL5180;

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
 * ブロック"Purc_Chk03_Io"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Purc_Chk03_IoR_MC_A extends MCConstRow {

	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_chk_flg = "no_chk_flg";
	/**
	 * Subcontracting mfg. result creation flg. 外注製造実績作成ＦＬＧ.<p>
	 *
	 */
	public static final String $outsrc_act_flg = "outsrc_act_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public static final String $src_peg_no = "src_peg_no";
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	public static final String $pai = "pai";
	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public static final String $purc_cont_qty = "purc_cont_qty";
	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public static final String $from_gd_cd = "from_gd_cd";
	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public static final String $dlv_loc_wg_cd = "dlv_loc_wg_cd";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $dlv_loc_cd = "dlv_loc_cd";
	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt = "ship_fr_valid_dt";

	public static final String $purc_act_io_no = $pai + ".purc_act_io_no";
	public static final String $purc_act_io_seq = $pai + ".purc_act_io_seq";
	public static final String $purc_act_d_no = $pai + ".purc_act_d_no";
	public static final String $purc_act_d_seq = $pai + ".purc_act_d_seq";
	public static final String $arr_act_no = $pai + ".arr_act_no";
	public static final String $purc_ret_act_io_no = $pai + ".purc_ret_act_io_no";
	public static final String $trd_unit_cd = $pai + ".trd_unit_cd";
	public static final String $trd_unit_qty = $pai + ".trd_unit_qty";
	public static final String $base_unit_cd = $pai + ".base_unit_cd";
	public static final String $base_unit_qty = $pai + ".base_unit_qty";
	public static final String $pack_unit_cd = $pai + ".pack_unit_cd";
	public static final String $pack_unit_qty = $pai + ".pack_unit_qty";
	public static final String $ver_no = $pai + ".ver_no";
	public static final String $gd_cd = $pai + ".gd_cd";
	public static final String $gi_wg_cd = $pai + ".gi_wg_cd";
	public static final String $gi_loc_cd = $pai + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $pai + ".gi_str_ln_cd";
	public static final String $gi_unit_cd = $pai + ".gi_unit_cd";
	public static final String $str_ln_cd = $pai + ".str_ln_cd";
	public static final String $lot_no = $pai + ".lot_no";
	public static final String $sublot_no = $pai + ".sublot_no";
	public static final String $quality_typ = $pai + ".quality_typ";
	public static final String $stk_insp_typ = $pai + ".stk_insp_typ";
	public static final String $stk_id_typ = $pai + ".stk_id_typ";
	public static final String $bp_lot_no = $pai + ".bp_lot_no";
	public static final String $bp_dlv_slip_no = $pai + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $pai + ".bp_dlv_slip_d_no";
	public static final String $sub_char1 = $pai + ".sub_char1";
	public static final String $sub_char2 = $pai + ".sub_char2";
	public static final String $sub_char3 = $pai + ".sub_char3";

	public static final MCMeta no_chk_flg_META = createCommonMeta($no_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_act_flg_META = createCommonMeta($outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta src_peg_no_META = createCommonMeta($src_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pai_META = createInnerRowMeta($pai, mcframe.serverMS.dbc.MST_PURC_ACT_IO_R.class);
	public static final MCMeta purc_cont_qty_META = createCommonMeta($purc_cont_qty, mcframe.commonMA.meta.MA_META.PURC_CONT_QTY);
	public static final MCMeta from_gd_cd_META = createCommonMeta($from_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta dlv_loc_wg_cd_META = createCommonMeta($dlv_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dlv_loc_cd_META = createCommonMeta($dlv_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Purc_Chk03_IoR> constMetas = new ConstMetaList<Purc_Chk03_IoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			no_chk_flg_META,
			outsrc_act_flg_META,
			data_crud_typ_META,
			src_peg_no_META,
			dtl_peg_no_META,
			peg_no_META,
			err_flg_META,
			pai_META,
			purc_cont_qty_META,
			from_gd_cd_META,
			dlv_loc_wg_cd_META,
			dlv_loc_cd_META,
			crt_lot_flg_META,
			stk_bp_cd_META,
			ship_fr_valid_dt_META
		},
		new String[][]{
			{
				"purc_act_io_no",
				"purc_act_io_seq",
				"purc_act_d_no",
				"purc_act_d_seq",
				"arr_act_no",
				"purc_ret_act_io_no",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"pack_unit_cd",
				"pack_unit_qty",
				"ver_no",
				"gd_cd",
				"gi_wg_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_unit_cd",
				"str_ln_cd",
				"lot_no",
				"sublot_no",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$purc_act_io_no,
				$purc_act_io_seq,
				$purc_act_d_no,
				$purc_act_d_seq,
				$arr_act_no,
				$purc_ret_act_io_no,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$pack_unit_cd,
				$pack_unit_qty,
				$ver_no,
				$gd_cd,
				$gi_wg_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_unit_cd,
				$str_ln_cd,
				$lot_no,
				$sublot_no,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
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
	protected Purc_Chk03_IoR_MC_A(ConstMetaList<? extends Purc_Chk03_IoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_IoR clone() {
		return (Purc_Chk03_IoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_IoR createInstance() {
		return (Purc_Chk03_IoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_IoR getValues(String... names) {
		return (Purc_Chk03_IoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_chk_flg() {
		return getConstBoolean(offset + 0, $no_chk_flg);
	}

	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public void no_chk_flg(boolean value) {
		setConstBoolean(offset + 0, $no_chk_flg, value);
	}


	/**
	 * Subcontracting mfg. result creation flg. 外注製造実績作成ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_act_flg() {
		return getConstBoolean(offset + 1, $outsrc_act_flg);
	}

	/**
	 * Subcontracting mfg. result creation flg. 外注製造実績作成ＦＬＧ.<p>
	 *
	 */
	public void outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 1, $outsrc_act_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public MCNumber src_peg_no() {
		return getConstNumber(offset + 3, $src_peg_no);
	}

	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public void src_peg_no(MCNumber value) {
		setConstNumber(offset + 3, $src_peg_no, value);
	}

	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public void src_peg_no(int value) {
		setConstNumber(offset + 3, $src_peg_no, value);
	}

	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public void src_peg_no(long value) {
		setConstNumber(offset + 3, $src_peg_no, value);
	}

	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public void src_peg_no(float value) {
		setConstNumber(offset + 3, $src_peg_no, value);
	}

	/**
	 * Original pegging No. 元紐付ＮＯ.<p>
	 *
	 */
	public void src_peg_no(double value) {
		setConstNumber(offset + 3, $src_peg_no, value);
	}


	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 4, $dtl_peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 5, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 5, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 5, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 6, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 6, $err_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PURC_ACT_IO_R pai(){
		return (mcframe.serverMS.dbc.MST_PURC_ACT_IO_R) getConstInnerRow(offset + 7, $pai);
	}
	
	public void pai(mcframe.serverMS.dbc.MST_PURC_ACT_IO_R row){
		setConstInnerRow(offset + 7, $pai, row);
	}


	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return getConstNumber(offset + 8, $purc_cont_qty);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		setConstNumber(offset + 8, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		setConstNumber(offset + 8, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		setConstNumber(offset + 8, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		setConstNumber(offset + 8, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		setConstNumber(offset + 8, $purc_cont_qty, value);
	}


	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public String from_gd_cd() {
		return getConstString(offset + 9, $from_gd_cd);
	}

	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public void from_gd_cd(String value) {
		setConstString(offset + 9, $from_gd_cd, value);
	}


	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public String dlv_loc_wg_cd() {
		return getConstString(offset + 10, $dlv_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public void dlv_loc_wg_cd(String value) {
		setConstString(offset + 10, $dlv_loc_wg_cd, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String dlv_loc_cd() {
		return getConstString(offset + 11, $dlv_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void dlv_loc_cd(String value) {
		setConstString(offset + 11, $dlv_loc_cd, value);
	}


	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 12, $crt_lot_flg);
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 12, $crt_lot_flg, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 13, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 13, $stk_bp_cd, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 14, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 14, $ship_fr_valid_dt, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			return from_gd_cd();
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			return dlv_loc_wg_cd();
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			return dlv_loc_cd();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			return src_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			return no_chk_flg();
		}
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			return outsrc_act_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			return from_gd_cd();
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			return dlv_loc_wg_cd();
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			return dlv_loc_cd();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			return src_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			return no_chk_flg();
		}
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			return outsrc_act_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			from_gd_cd(value);
			return;
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			dlv_loc_wg_cd(value);
			return;
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			dlv_loc_cd(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			no_chk_flg(value);
			return;
		}
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			outsrc_act_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			from_gd_cd(value);
			return;
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			dlv_loc_wg_cd(value);
			return;
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			dlv_loc_cd(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($src_peg_no.equalsIgnoreCase(name)) {
			src_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			no_chk_flg(value);
			return;
		}
		if ($outsrc_act_flg.equalsIgnoreCase(name)) {
			outsrc_act_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pai.equalsIgnoreCase(name)) {
			return pai();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pai.equalsIgnoreCase(name)) {
			pai(
				((MCContainerMeta) pai_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_ACT_IO_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return pai().purc_act_io_no();
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		pai().purc_act_io_no(value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public MCNumber purc_act_io_seq() {
		return pai().purc_act_io_seq();
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(MCNumber value) {
		pai().purc_act_io_seq(value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(int value) {
		pai().purc_act_io_seq(value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(long value) {
		pai().purc_act_io_seq(value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(float value) {
		pai().purc_act_io_seq(value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(double value) {
		pai().purc_act_io_seq(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return pai().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		pai().purc_act_d_no(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return pai().purc_act_d_seq();
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		pai().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		pai().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		pai().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		pai().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		pai().purc_act_d_seq(value);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return pai().arr_act_no();
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		pai().arr_act_no(value);
	}

	/**
	 * Purchase return result GR/GI No. 仕入返品実績受払ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_io_no() {
		return pai().purc_ret_act_io_no();
	}

	/**
	 * Purchase return result GR/GI No. 仕入返品実績受払ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_io_no(String value) {
		pai().purc_ret_act_io_no(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return pai().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		pai().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return pai().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		pai().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		pai().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		pai().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		pai().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		pai().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return pai().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		pai().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return pai().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		pai().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		pai().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		pai().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		pai().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		pai().base_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return pai().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		pai().pack_unit_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return pai().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		pai().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		pai().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		pai().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		pai().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		pai().pack_unit_qty(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return pai().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		pai().ver_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return pai().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		pai().gd_cd(value);
	}

	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return pai().gi_wg_cd();
	}

	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		pai().gi_wg_cd(value);
	}

	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return pai().gi_loc_cd();
	}

	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		pai().gi_loc_cd(value);
	}

	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return pai().gi_str_ln_cd();
	}

	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		pai().gi_str_ln_cd(value);
	}

	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public String gi_unit_cd() {
		return pai().gi_unit_cd();
	}

	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public void gi_unit_cd(String value) {
		pai().gi_unit_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return pai().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		pai().str_ln_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return pai().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		pai().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return pai().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		pai().sublot_no(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return pai().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		pai().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return pai().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		pai().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return pai().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		pai().stk_id_typ(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return pai().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		pai().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return pai().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		pai().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return pai().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		pai().bp_dlv_slip_d_no(value);
	}

	/**
	 * Spare column 1 予備項目１.<p>
	 *
	 */
	public String sub_char1() {
		return pai().sub_char1();
	}

	/**
	 * Spare column 1 予備項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pai().sub_char1(value);
	}

	/**
	 * Spare column 2 予備項目２.<p>
	 *
	 */
	public String sub_char2() {
		return pai().sub_char2();
	}

	/**
	 * Spare column 2 予備項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pai().sub_char2(value);
	}

	/**
	 * Spare column 3 予備項目３.<p>
	 *
	 */
	public String sub_char3() {
		return pai().sub_char3();
	}

	/**
	 * Spare column 3 予備項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pai().sub_char3(value);
	}

}

