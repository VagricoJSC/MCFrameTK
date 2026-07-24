package mcframe.serverMSLA.MSLAL5030;

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
 * ブロック"PoPrmsRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoPrmsRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $prms = "prms";
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public static final String $rem_base_unit_qty = "rem_base_unit_qty";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";

	public static final String $data_lno = $prms + ".data_lno";
	public static final String $data_no = $prms + ".data_no";
	public static final String $ext_data_no = $prms + ".ext_data_no";
	public static final String $ext_data_lno = $prms + ".ext_data_lno";
	public static final String $data_crud_typ = $prms + ".data_crud_typ";
	public static final String $exe_sts_typ = $prms + ".exe_sts_typ";
	public static final String $po_no = $prms + ".po_no";
	public static final String $po_rev = $prms + ".po_rev";
	public static final String $po_d_no = $prms + ".po_d_no";
	public static final String $sppl_cd = $prms + ".sppl_cd";
	public static final String $itm_cd = $prms + ".itm_cd";
	public static final String $itm_sub1 = $prms + ".itm_sub1";
	public static final String $itm_sub2 = $prms + ".itm_sub2";
	public static final String $itm_sub3 = $prms + ".itm_sub3";
	public static final String $trd_unit_cd = $prms + ".trd_unit_cd";
	public static final String $trd_unit_qty = $prms + ".trd_unit_qty";
	public static final String $prms_dlv_tm = $prms + ".prms_dlv_tm";
	public static final String $prms_rmrks = $prms + ".prms_rmrks";
	public static final String $dlv_inst_rev = $prms + ".dlv_inst_rev";
	public static final String $dlv_inst_no = $prms + ".dlv_inst_no";
	public static final String $dlv_inst_d_no = $prms + ".dlv_inst_d_no";
	public static final String $sub_char1 = $prms + ".sub_char1";
	public static final String $sub_char2 = $prms + ".sub_char2";
	public static final String $sub_char3 = $prms + ".sub_char3";
	public static final String $sub_char4 = $prms + ".sub_char4";
	public static final String $sub_char5 = $prms + ".sub_char5";
	public static final String $sub_char6 = $prms + ".sub_char6";
	public static final String $sub_char7 = $prms + ".sub_char7";
	public static final String $sub_char8 = $prms + ".sub_char8";
	public static final String $sub_char9 = $prms + ".sub_char9";
	public static final String $sub_char10 = $prms + ".sub_char10";
	public static final String $sub_char11 = $prms + ".sub_char11";
	public static final String $sub_char12 = $prms + ".sub_char12";
	public static final String $sub_char13 = $prms + ".sub_char13";
	public static final String $sub_char14 = $prms + ".sub_char14";
	public static final String $sub_char15 = $prms + ".sub_char15";
	public static final String $sub_char16 = $prms + ".sub_char16";
	public static final String $sub_char17 = $prms + ".sub_char17";
	public static final String $sub_char18 = $prms + ".sub_char18";
	public static final String $sub_char19 = $prms + ".sub_char19";
	public static final String $sub_char20 = $prms + ".sub_char20";
	public static final String $sub_char21 = $prms + ".sub_char21";
	public static final String $sub_char22 = $prms + ".sub_char22";
	public static final String $sub_char23 = $prms + ".sub_char23";
	public static final String $sub_char24 = $prms + ".sub_char24";
	public static final String $sub_char25 = $prms + ".sub_char25";
	public static final String $sub_char26 = $prms + ".sub_char26";
	public static final String $sub_char27 = $prms + ".sub_char27";
	public static final String $sub_char28 = $prms + ".sub_char28";
	public static final String $sub_char29 = $prms + ".sub_char29";
	public static final String $sub_char30 = $prms + ".sub_char30";
	public static final String $sub_num1 = $prms + ".sub_num1";
	public static final String $sub_num2 = $prms + ".sub_num2";
	public static final String $sub_num3 = $prms + ".sub_num3";
	public static final String $sub_num4 = $prms + ".sub_num4";
	public static final String $sub_num5 = $prms + ".sub_num5";
	public static final String $sub_dt1 = $prms + ".sub_dt1";
	public static final String $sub_dt2 = $prms + ".sub_dt2";
	public static final String $sub_dt3 = $prms + ".sub_dt3";
	public static final String $sub_dt4 = $prms + ".sub_dt4";
	public static final String $sub_dt5 = $prms + ".sub_dt5";
	public static final String $log_sub_key1 = $prms + ".log_sub_key1";
	public static final String $log_sub_key2 = $prms + ".log_sub_key2";

	public static final MCMeta prms_META = createInnerRowMeta($prms, mcframe.serverMS.dbc.MST_PRMS_RECV_IF_R.class);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rem_base_unit_qty_META = createCommonMeta($rem_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);

	protected static final ConstMetaList<PoPrmsRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<PoPrmsRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prms_META,
			sppl_cal_cd_META,
			prms_recv_flg_META,
			subcon_flg_META,
			err_flg_META,
			peg_no_META,
			hdr_peg_no_META,
			dtl_peg_no_META,
			base_unit_qty_META,
			purc_schd_dt_META,
			rem_base_unit_qty_META,
			wg_cd_META,
			purc_usr_cd_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_data_no",
				"ext_data_lno",
				"data_crud_typ",
				"exe_sts_typ",
				"po_no",
				"po_rev",
				"po_d_no",
				"sppl_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"trd_unit_cd",
				"trd_unit_qty",
				"prms_dlv_tm",
				"prms_rmrks",
				"dlv_inst_rev",
				"dlv_inst_no",
				"dlv_inst_d_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sub_char4",
				"sub_char5",
				"sub_char6",
				"sub_char7",
				"sub_char8",
				"sub_char9",
				"sub_char10",
				"sub_char11",
				"sub_char12",
				"sub_char13",
				"sub_char14",
				"sub_char15",
				"sub_char16",
				"sub_char17",
				"sub_char18",
				"sub_char19",
				"sub_char20",
				"sub_char21",
				"sub_char22",
				"sub_char23",
				"sub_char24",
				"sub_char25",
				"sub_char26",
				"sub_char27",
				"sub_char28",
				"sub_char29",
				"sub_char30",
				"sub_num1",
				"sub_num2",
				"sub_num3",
				"sub_num4",
				"sub_num5",
				"sub_dt1",
				"sub_dt2",
				"sub_dt3",
				"sub_dt4",
				"sub_dt5",
				"log_sub_key1",
				"log_sub_key2"
			},
			{
				$data_lno,
				$data_no,
				$ext_data_no,
				$ext_data_lno,
				$data_crud_typ,
				$exe_sts_typ,
				$po_no,
				$po_rev,
				$po_d_no,
				$sppl_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$trd_unit_cd,
				$trd_unit_qty,
				$prms_dlv_tm,
				$prms_rmrks,
				$dlv_inst_rev,
				$dlv_inst_no,
				$dlv_inst_d_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sub_char4,
				$sub_char5,
				$sub_char6,
				$sub_char7,
				$sub_char8,
				$sub_char9,
				$sub_char10,
				$sub_char11,
				$sub_char12,
				$sub_char13,
				$sub_char14,
				$sub_char15,
				$sub_char16,
				$sub_char17,
				$sub_char18,
				$sub_char19,
				$sub_char20,
				$sub_char21,
				$sub_char22,
				$sub_char23,
				$sub_char24,
				$sub_char25,
				$sub_char26,
				$sub_char27,
				$sub_char28,
				$sub_char29,
				$sub_char30,
				$sub_num1,
				$sub_num2,
				$sub_num3,
				$sub_num4,
				$sub_num5,
				$sub_dt1,
				$sub_dt2,
				$sub_dt3,
				$sub_dt4,
				$sub_dt5,
				$log_sub_key1,
				$log_sub_key2
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
				{$prms + ".data_lno", "E"},	// prms.data_lno
				{$prms + ".data_no", "E"},	// prms.data_no
				{$prms + ".ext_data_no", "E"},	// prms.ext_data_no
				{$prms + ".ext_data_lno", "E"},	// prms.ext_data_lno
				{$prms + ".data_crud_typ", "E"},	// prms.data_crud_typ
				{$prms + ".po_no", "E"},	// prms.po_no
				{$prms + ".po_d_no", "E"},	// prms.po_d_no
				{$prms + ".sppl_cd", "E"},	// prms.sppl_cd
				{$prms + ".trd_unit_cd", "E"},	// prms.trd_unit_cd
				{$prms + ".trd_unit_qty", "E"},	// prms.trd_unit_qty
				{$prms + ".prms_dlv_tm", "E"}	// prms.prms_dlv_tm
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$prms + ".trd_unit_qty", "positive"}	// prms.trd_unit_qty
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
				{$prms + ".sppl_cd", "MA.MAUAL0010.Bp"}	// prms.sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$prms + ".sppl_cd", "prms_recv_flg;sppl_cal_cd;subcon_flg"}	// prms.sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$prms + ".sppl_cd", "prms_recv_flg;sppl_cal_cd;subcon_flg"}	// prms.sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$prms + ".sppl_cd", "MAC_BP_IS_SRCH_TYP.SPPL"}	// prms.sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$prms + ".sppl_cd", "bp_is_srch_typ"}	// prms.sppl_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$prms + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// prms.data_crud_typ
				{$prms + ".exe_sts_typ", "MAC_EXE_STS_TYP"}	// prms.exe_sts_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$prms + ".itm_sub1", "E"},	// prms.itm_sub1
				{$prms + ".itm_sub2", "E"},	// prms.itm_sub2
				{$prms + ".itm_sub3", "E"}	// prms.itm_sub3
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
	protected PoPrmsRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends PoPrmsRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoPrmsRecvIf_Chk01_DtlR clone() {
		return (PoPrmsRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoPrmsRecvIf_Chk01_DtlR createInstance() {
		return (PoPrmsRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoPrmsRecvIf_Chk01_DtlR getValues(String... names) {
		return (PoPrmsRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_PRMS_RECV_IF_R prms(){
		return (mcframe.serverMS.dbc.MST_PRMS_RECV_IF_R) getConstInnerRow(offset + 0, $prms);
	}
	
	public void prms(mcframe.serverMS.dbc.MST_PRMS_RECV_IF_R row){
		setConstInnerRow(offset + 0, $prms, row);
	}


	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 1, $sppl_cal_cd);
	}

	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 1, $sppl_cal_cd, value);
	}


	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 2, $prms_recv_flg);
	}

	/**
	 * Check order promising 納期回答確認.<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 2, $prms_recv_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 3, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 3, $subcon_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 4, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 4, $err_flg, value);
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
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 6, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 6, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 6, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 6, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 6, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 6, $hdr_peg_no, value);
	}


	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 7, $dtl_peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 7, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 7, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 7, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 7, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 7, $dtl_peg_no, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 8, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 8, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 8, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 8, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 8, $base_unit_qty, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 9, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 9, $purc_schd_dt, value);
	}


	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public MCNumber rem_base_unit_qty() {
		return getConstNumber(offset + 10, $rem_base_unit_qty);
	}

	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public void rem_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 10, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public void rem_base_unit_qty(int value) {
		setConstNumber(offset + 10, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public void rem_base_unit_qty(long value) {
		setConstNumber(offset + 10, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public void rem_base_unit_qty(float value) {
		setConstNumber(offset + 10, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining base unit qty. 残基準単位数量.<p>
	 *
	 */
	public void rem_base_unit_qty(double value) {
		setConstNumber(offset + 10, $rem_base_unit_qty, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 12, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 12, $purc_usr_cd, value);
	}


	public String getString(String name) {
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			return rem_base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			return rem_base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($prms.equalsIgnoreCase(name)) {
			return prms();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($prms.equalsIgnoreCase(name)) {
			prms(
				((MCContainerMeta) prms_META).castInnerRow(mcframe.serverMS.dbc.MST_PRMS_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return prms().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		prms().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		prms().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		prms().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		prms().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		prms().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return prms().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		prms().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		prms().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		prms().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		prms().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		prms().data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return prms().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		prms().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		prms().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		prms().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		prms().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		prms().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return prms().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		prms().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		prms().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		prms().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		prms().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		prms().ext_data_lno(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return prms().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		prms().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return prms().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		prms().exe_sts_typ(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return prms().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		prms().po_no(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return prms().po_rev();
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		prms().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		prms().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		prms().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		prms().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		prms().po_rev(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return prms().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		prms().po_d_no(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return prms().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		prms().sppl_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return prms().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		prms().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return prms().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		prms().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return prms().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		prms().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return prms().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		prms().itm_sub3(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return prms().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		prms().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return prms().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		prms().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		prms().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		prms().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		prms().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		prms().trd_unit_qty(value);
	}

	/**
	 * Replied delivery date and time 回答納入日時.<p>
	 *
	 */
	public MCDate prms_dlv_tm() {
		return prms().prms_dlv_tm();
	}

	/**
	 * Replied delivery date and time 回答納入日時.<p>
	 *
	 */
	public void prms_dlv_tm(MCDate value) {
		prms().prms_dlv_tm(value);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return prms().prms_rmrks();
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		prms().prms_rmrks(value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public MCNumber dlv_inst_rev() {
		return prms().dlv_inst_rev();
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(MCNumber value) {
		prms().dlv_inst_rev(value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(int value) {
		prms().dlv_inst_rev(value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(long value) {
		prms().dlv_inst_rev(value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(float value) {
		prms().dlv_inst_rev(value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(double value) {
		prms().dlv_inst_rev(value);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return prms().dlv_inst_no();
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		prms().dlv_inst_no(value);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return prms().dlv_inst_d_no();
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		prms().dlv_inst_d_no(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return prms().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		prms().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return prms().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		prms().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return prms().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		prms().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return prms().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		prms().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return prms().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		prms().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return prms().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		prms().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return prms().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		prms().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return prms().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		prms().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return prms().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		prms().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return prms().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		prms().sub_char10(value);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return prms().sub_char11();
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		prms().sub_char11(value);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return prms().sub_char12();
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		prms().sub_char12(value);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return prms().sub_char13();
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		prms().sub_char13(value);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return prms().sub_char14();
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		prms().sub_char14(value);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return prms().sub_char15();
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		prms().sub_char15(value);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return prms().sub_char16();
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		prms().sub_char16(value);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return prms().sub_char17();
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		prms().sub_char17(value);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return prms().sub_char18();
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		prms().sub_char18(value);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return prms().sub_char19();
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		prms().sub_char19(value);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return prms().sub_char20();
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		prms().sub_char20(value);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return prms().sub_char21();
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		prms().sub_char21(value);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return prms().sub_char22();
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		prms().sub_char22(value);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return prms().sub_char23();
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		prms().sub_char23(value);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return prms().sub_char24();
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		prms().sub_char24(value);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return prms().sub_char25();
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		prms().sub_char25(value);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return prms().sub_char26();
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		prms().sub_char26(value);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return prms().sub_char27();
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		prms().sub_char27(value);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return prms().sub_char28();
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		prms().sub_char28(value);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return prms().sub_char29();
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		prms().sub_char29(value);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return prms().sub_char30();
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		prms().sub_char30(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return prms().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		prms().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		prms().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		prms().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		prms().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		prms().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return prms().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		prms().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		prms().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		prms().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		prms().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		prms().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return prms().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		prms().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		prms().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		prms().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		prms().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		prms().sub_num3(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return prms().sub_num4();
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		prms().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		prms().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		prms().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		prms().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		prms().sub_num4(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return prms().sub_num5();
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		prms().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		prms().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		prms().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		prms().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		prms().sub_num5(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return prms().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		prms().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return prms().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		prms().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return prms().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		prms().sub_dt3(value);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return prms().sub_dt4();
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		prms().sub_dt4(value);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return prms().sub_dt5();
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		prms().sub_dt5(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return prms().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		prms().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		prms().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		prms().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		prms().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		prms().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return prms().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		prms().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		prms().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		prms().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		prms().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		prms().log_sub_key2(value);
	}

}

