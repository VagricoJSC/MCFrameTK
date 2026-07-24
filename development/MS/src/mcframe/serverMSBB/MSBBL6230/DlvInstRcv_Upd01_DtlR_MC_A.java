package mcframe.serverMSBB.MSBBL6230;

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
 * ブロック"DlvInstRcv_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvInstRcv_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public static final String $rcpt = "rcpt";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $slo_upd_cntr = "slo_upd_cntr";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public static final String $valid_dt_fr = "valid_dt_fr";
	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public static final String $valid_dt_fr_grp = "valid_dt_fr_grp";
	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Update sales order 受注更新.<p>
	 *
	 */
	public static final String $slo_upd_flg = "slo_upd_flg";
	/**
	 * Release allocation flg. 引当解除ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_rel_flg = "alloc_rel_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";

	public static final String $dlv_inst_rcpt_no = $rcpt + ".dlv_inst_rcpt_no";
	public static final String $dlv_inst_rcpt_rev = $rcpt + ".dlv_inst_rcpt_rev";
	public static final String $slo_d_no = $rcpt + ".slo_d_no";
	public static final String $cst_dlv_inst_no = $rcpt + ".cst_dlv_inst_no";
	public static final String $cst_dlv_inst_rev = $rcpt + ".cst_dlv_inst_rev";
	public static final String $cst_dlv_inst_d_no = $rcpt + ".cst_dlv_inst_d_no";
	public static final String $dlv_rqst_tm = $rcpt + ".dlv_rqst_tm";
	public static final String $trd_unit_cd = $rcpt + ".trd_unit_cd";
	public static final String $trd_unit_qty = $rcpt + ".trd_unit_qty";
	public static final String $base_unit_cd = $rcpt + ".base_unit_cd";
	public static final String $base_unit_qty = $rcpt + ".base_unit_qty";
	public static final String $cst_dlv_inst_rmrks = $rcpt + ".cst_dlv_inst_rmrks";
	public static final String $cst_dlv_inst_d_rmrks = $rcpt + ".cst_dlv_inst_d_rmrks";
	public static final String $edi_flg = $rcpt + ".edi_flg";
	public static final String $intr_rmrks = $rcpt + ".intr_rmrks";
	public static final String $dlv_cd = $rcpt + ".dlv_cd";
	public static final String $dlv_sundry_flg = $rcpt + ".dlv_sundry_flg";
	public static final String $dlv_nm = $rcpt + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $rcpt + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $rcpt + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $rcpt + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $rcpt + ".dlv_addr1";
	public static final String $dlv_addr2 = $rcpt + ".dlv_addr2";
	public static final String $dlv_addr3 = $rcpt + ".dlv_addr3";
	public static final String $dlv_addr4 = $rcpt + ".dlv_addr4";
	public static final String $dlv_tel = $rcpt + ".dlv_tel";
	public static final String $dlv_fax = $rcpt + ".dlv_fax";
	public static final String $dlv_lg_grp_cd = $rcpt + ".dlv_lg_grp_cd";
	public static final String $pri_prnt_flg = $rcpt + ".pri_prnt_flg";
	public static final String $tdlv_cd = $rcpt + ".tdlv_cd";
	public static final String $tdlv_sundry_flg = $rcpt + ".tdlv_sundry_flg";
	public static final String $tdlv_nm = $rcpt + ".tdlv_nm";
	public static final String $via_dlv_typ = $rcpt + ".via_dlv_typ";
	public static final String $tdlv_cntct_dpt = $rcpt + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $rcpt + ".tdlv_cntct_psn";
	public static final String $tdlv_zip_cd = $rcpt + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $rcpt + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $rcpt + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $rcpt + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $rcpt + ".tdlv_addr4";
	public static final String $tdlv_tel = $rcpt + ".tdlv_tel";
	public static final String $tdlv_fax = $rcpt + ".tdlv_fax";
	public static final String $tdlv_lg_grp_cd = $rcpt + ".tdlv_lg_grp_cd";
	public static final String $dlv_day_week_typ = $rcpt + ".dlv_day_week_typ";
	public static final String $sub_char1 = $rcpt + ".sub_char1";
	public static final String $sub_char2 = $rcpt + ".sub_char2";
	public static final String $sub_char3 = $rcpt + ".sub_char3";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta rcpt_META = createInnerRowMeta($rcpt, mcframe.serverMS.dbc.MST_DLV_INST_RCPT_R.class);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta valid_dt_fr_META = createCommonMeta($valid_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_fr_grp_META = createCommonMeta($valid_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta slo_upd_flg_META = createCommonMeta($slo_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_rel_flg_META = createCommonMeta($alloc_rel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DlvInstRcv_Upd01_DtlR> constMetas = new ConstMetaList<DlvInstRcv_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			rcpt_META,
			ship_pr_upd_cntr_META,
			slo_no_META,
			sls_dpt_cd_META,
			slo_upd_cntr_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_wk_cd_META,
			valid_dt_fr_META,
			valid_dt_fr_grp_META,
			valid_dt_to_META,
			wg_rqst_no_META,
			slo_upd_flg_META,
			alloc_rel_flg_META,
			err_flg_META,
			peg_no_META,
			is_src_batch_flg_META
		},
		new String[][]{
			{
				"dlv_inst_rcpt_no",
				"dlv_inst_rcpt_rev",
				"slo_d_no",
				"cst_dlv_inst_no",
				"cst_dlv_inst_rev",
				"cst_dlv_inst_d_no",
				"dlv_rqst_tm",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"cst_dlv_inst_rmrks",
				"cst_dlv_inst_d_rmrks",
				"edi_flg",
				"intr_rmrks",
				"dlv_cd",
				"dlv_sundry_flg",
				"dlv_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_lg_grp_cd",
				"pri_prnt_flg",
				"tdlv_cd",
				"tdlv_sundry_flg",
				"tdlv_nm",
				"via_dlv_typ",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_lg_grp_cd",
				"dlv_day_week_typ",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$dlv_inst_rcpt_no,
				$dlv_inst_rcpt_rev,
				$slo_d_no,
				$cst_dlv_inst_no,
				$cst_dlv_inst_rev,
				$cst_dlv_inst_d_no,
				$dlv_rqst_tm,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$cst_dlv_inst_rmrks,
				$cst_dlv_inst_d_rmrks,
				$edi_flg,
				$intr_rmrks,
				$dlv_cd,
				$dlv_sundry_flg,
				$dlv_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_lg_grp_cd,
				$pri_prnt_flg,
				$tdlv_cd,
				$tdlv_sundry_flg,
				$tdlv_nm,
				$via_dlv_typ,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_lg_grp_cd,
				$dlv_day_week_typ,
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
				{$rcpt + ".slo_d_no", "E"}	// rcpt.slo_d_no
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$rcpt + ".trd_unit_qty", "positive"}	// rcpt.trd_unit_qty
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
				{$rcpt + ".dlv_cd", "MA.MAUAL0010.Bp"},	// rcpt.dlv_cd
				{$rcpt + ".dlv_lg_grp_cd", "MA.MAUAL0010.LgGrp"},	// rcpt.dlv_lg_grp_cd
				{$rcpt + ".tdlv_cd", "MA.MAUAL0010.Bp"},	// rcpt.tdlv_cd
				{$rcpt + ".tdlv_lg_grp_cd", "MA.MAUAL0010.LgGrp"}	// rcpt.tdlv_lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$rcpt + ".dlv_cd", "dlv_sundry_flg"},	// rcpt.dlv_cd
				{$rcpt + ".tdlv_cd", "tdlv_sundry_flg"}	// rcpt.tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$rcpt + ".dlv_cd", "dlv_sundry_flg"},	// rcpt.dlv_cd
				{$rcpt + ".tdlv_cd", "dlv_sundry_flg"}	// rcpt.tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcpt + ".dlv_cd", "MAC_BP_IS_SRCH_TYP.DLV"},	// rcpt.dlv_cd
				{$rcpt + ".tdlv_cd", "MAC_BP_IS_SRCH_TYP.TDLV"}	// rcpt.tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcpt + ".dlv_cd", "bp_is_srch_typ"},	// rcpt.dlv_cd
				{$rcpt + ".tdlv_cd", "bp_is_srch_typ"}	// rcpt.tdlv_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$rcpt + ".via_dlv_typ", "MAC_VIA_DLV_TYP"},	// rcpt.via_dlv_typ
				{$rcpt + ".dlv_day_week_typ", "MAC_DAY_WEEK_TYP"}	// rcpt.dlv_day_week_typ
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
	protected DlvInstRcv_Upd01_DtlR_MC_A(ConstMetaList<? extends DlvInstRcv_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRcv_Upd01_DtlR clone() {
		return (DlvInstRcv_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRcv_Upd01_DtlR createInstance() {
		return (DlvInstRcv_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRcv_Upd01_DtlR getValues(String... names) {
		return (DlvInstRcv_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_DLV_INST_RCPT_R rcpt(){
		return (mcframe.serverMS.dbc.MST_DLV_INST_RCPT_R) getConstInnerRow(offset + 1, $rcpt);
	}
	
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public void rcpt(mcframe.serverMS.dbc.MST_DLV_INST_RCPT_R row){
		setConstInnerRow(offset + 1, $rcpt, row);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 2, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 2, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 2, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 2, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 2, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 2, $ship_pr_upd_cntr, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 3, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 3, $slo_no, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 4, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 4, $sls_dpt_cd, value);
	}


	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 5, $slo_upd_cntr);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 5, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 5, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 5, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 5, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 5, $slo_upd_cntr, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 6, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 6, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 7, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 7, $dlv_schd_tm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 8, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 8, $ship_wk_cd, value);
	}


	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public MCDate valid_dt_fr() {
		return getConstDate(offset + 9, $valid_dt_fr);
	}

	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public void valid_dt_fr(MCDate value) {
		setConstDate(offset + 9, $valid_dt_fr, value);
	}


	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public MCNumber valid_dt_fr_grp() {
		return getConstNumber(offset + 10, $valid_dt_fr_grp);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 10, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(int value) {
		setConstNumber(offset + 10, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(long value) {
		setConstNumber(offset + 10, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(float value) {
		setConstNumber(offset + 10, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(double value) {
		setConstNumber(offset + 10, $valid_dt_fr_grp, value);
	}


	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 11, $valid_dt_to);
	}

	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 11, $valid_dt_to, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 12, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 12, $wg_rqst_no, value);
	}


	/**
	 * Update sales order 受注更新.<p>
	 *
	 */
	public boolean slo_upd_flg() {
		return getConstBoolean(offset + 13, $slo_upd_flg);
	}

	/**
	 * Update sales order 受注更新.<p>
	 *
	 */
	public void slo_upd_flg(boolean value) {
		setConstBoolean(offset + 13, $slo_upd_flg, value);
	}


	/**
	 * Release allocation flg. 引当解除ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_rel_flg() {
		return getConstBoolean(offset + 14, $alloc_rel_flg);
	}

	/**
	 * Release allocation flg. 引当解除ＦＬＧ.<p>
	 *
	 */
	public void alloc_rel_flg(boolean value) {
		setConstBoolean(offset + 14, $alloc_rel_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 15, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 15, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 16, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 16, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 16, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 16, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 16, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 16, $peg_no, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 17, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 17, $is_src_batch_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($slo_upd_flg.equalsIgnoreCase(name)) {
			return slo_upd_flg();
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			return alloc_rel_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($slo_upd_flg.equalsIgnoreCase(name)) {
			return slo_upd_flg();
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			return alloc_rel_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($slo_upd_flg.equalsIgnoreCase(name)) {
			slo_upd_flg(value);
			return;
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			alloc_rel_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($slo_upd_flg.equalsIgnoreCase(name)) {
			slo_upd_flg(value);
			return;
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			alloc_rel_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcpt.equalsIgnoreCase(name)) {
			return rcpt();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcpt.equalsIgnoreCase(name)) {
			rcpt(
				((MCContainerMeta) rcpt_META).castInnerRow(mcframe.serverMS.dbc.MST_DLV_INST_RCPT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return rcpt().dlv_inst_rcpt_no();
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		rcpt().dlv_inst_rcpt_no(value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public MCNumber dlv_inst_rcpt_rev() {
		return rcpt().dlv_inst_rcpt_rev();
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(MCNumber value) {
		rcpt().dlv_inst_rcpt_rev(value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(int value) {
		rcpt().dlv_inst_rcpt_rev(value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(long value) {
		rcpt().dlv_inst_rcpt_rev(value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(float value) {
		rcpt().dlv_inst_rcpt_rev(value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(double value) {
		rcpt().dlv_inst_rcpt_rev(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return rcpt().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		rcpt().slo_d_no(value);
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return rcpt().cst_dlv_inst_no();
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		rcpt().cst_dlv_inst_no(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public MCNumber cst_dlv_inst_rev() {
		return rcpt().cst_dlv_inst_rev();
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(MCNumber value) {
		rcpt().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(int value) {
		rcpt().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(long value) {
		rcpt().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(float value) {
		rcpt().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(double value) {
		rcpt().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return rcpt().cst_dlv_inst_d_no();
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		rcpt().cst_dlv_inst_d_no(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return rcpt().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		rcpt().dlv_rqst_tm(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return rcpt().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		rcpt().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return rcpt().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		rcpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		rcpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		rcpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		rcpt().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		rcpt().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return rcpt().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		rcpt().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return rcpt().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		rcpt().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		rcpt().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		rcpt().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		rcpt().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		rcpt().base_unit_qty(value);
	}

	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public String cst_dlv_inst_rmrks() {
		return rcpt().cst_dlv_inst_rmrks();
	}

	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public void cst_dlv_inst_rmrks(String value) {
		rcpt().cst_dlv_inst_rmrks(value);
	}

	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public String cst_dlv_inst_d_rmrks() {
		return rcpt().cst_dlv_inst_d_rmrks();
	}

	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public void cst_dlv_inst_d_rmrks(String value) {
		rcpt().cst_dlv_inst_d_rmrks(value);
	}

	/**
	 * EDI ＥＤＩ　.<p>
	 *
	 */
	public boolean edi_flg() {
		return rcpt().edi_flg();
	}

	/**
	 * EDI ＥＤＩ　.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		rcpt().edi_flg(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return rcpt().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		rcpt().intr_rmrks(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return rcpt().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		rcpt().dlv_cd(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return rcpt().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		rcpt().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return rcpt().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		rcpt().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return rcpt().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		rcpt().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return rcpt().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		rcpt().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return rcpt().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		rcpt().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return rcpt().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		rcpt().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return rcpt().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		rcpt().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return rcpt().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		rcpt().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return rcpt().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		rcpt().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return rcpt().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		rcpt().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return rcpt().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		rcpt().dlv_fax(value);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return rcpt().dlv_lg_grp_cd();
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		rcpt().dlv_lg_grp_cd(value);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return rcpt().pri_prnt_flg();
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		rcpt().pri_prnt_flg(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return rcpt().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		rcpt().tdlv_cd(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return rcpt().tdlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		rcpt().tdlv_sundry_flg(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return rcpt().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		rcpt().tdlv_nm(value);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return rcpt().via_dlv_typ();
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		rcpt().via_dlv_typ(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return rcpt().tdlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		rcpt().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return rcpt().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		rcpt().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return rcpt().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		rcpt().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return rcpt().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		rcpt().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return rcpt().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		rcpt().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return rcpt().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		rcpt().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return rcpt().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		rcpt().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return rcpt().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		rcpt().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return rcpt().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		rcpt().tdlv_fax(value);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return rcpt().tdlv_lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		rcpt().tdlv_lg_grp_cd(value);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return rcpt().dlv_day_week_typ();
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		rcpt().dlv_day_week_typ(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return rcpt().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		rcpt().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return rcpt().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		rcpt().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return rcpt().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		rcpt().sub_char3(value);
	}

}

