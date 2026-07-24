package mcframe.serverMSBF.MSBFL0100;

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
 * ブロック"Chk02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_no = "mrkt_judg_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public static final String $acpt_flg = "acpt_flg";
	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public static final String $not_acpt_flg = "not_acpt_flg";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Market release approval role cd. 市場出荷承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";
	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public static final String $main_flg = "main_flg";
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 * Decision PIC 判定者.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 * Decision dept. 判定部門.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ = "mfg_so_aprv_typ";
	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public static final String $quality_mng_typ = "quality_mng_typ";
	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public static final String $mfg_mng_typ = "mfg_mng_typ";
	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public static final String $deviant_typ = "deviant_typ";
	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public static final String $deviant_msr_typ = "deviant_msr_typ";
	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public static final String $prod_itm_info_typ = "prod_itm_info_typ";
	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public static final String $chd_itm_info_typ = "chd_itm_info_typ";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_prnt_flg = "mrkt_judg_prnt_flg";
	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public static final String $mrkt_judg_prnt_tm = "mrkt_judg_prnt_tm";
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 * Market release decision making based type 市場出荷判定作成元区分.<p>
	 *
	 */
	public static final String $mrkt_judg_src_typ = "mrkt_judg_src_typ";
	/**
	 * Creation source cancel not possible 作成元取消不可.<p>
	 *
	 */
	public static final String $no_del_flg = "no_del_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Push notification dept. cd. プッシュ通知の部門ＣＤ.<p>
	 *
	 */
	public static final String $push_dpt_cd = "push_dpt_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_no_META = createCommonMeta($mrkt_judg_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta acpt_flg_META = createCommonMeta($acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_acpt_flg_META = createCommonMeta($not_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta main_flg_META = createCommonMeta($main_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.MRKT_JUDG_RSN);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MRKT_JUDG_INTR_RMRKS);
	public static final MCMeta mfg_so_aprv_typ_META = createCommonMeta($mfg_so_aprv_typ, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP);
	public static final MCMeta quality_mng_typ_META = createCommonMeta($quality_mng_typ, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP);
	public static final MCMeta mfg_mng_typ_META = createCommonMeta($mfg_mng_typ, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP);
	public static final MCMeta deviant_typ_META = createCommonMeta($deviant_typ, mcframe.commonMS.meta.MS_META.DEVIANT_TYP);
	public static final MCMeta deviant_msr_typ_META = createCommonMeta($deviant_msr_typ, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP);
	public static final MCMeta prod_itm_info_typ_META = createCommonMeta($prod_itm_info_typ, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP);
	public static final MCMeta chd_itm_info_typ_META = createCommonMeta($chd_itm_info_typ, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta mrkt_judg_prnt_flg_META = createCommonMeta($mrkt_judg_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_prnt_tm_META = createCommonMeta($mrkt_judg_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrkt_judg_src_typ_META = createCommonMeta($mrkt_judg_src_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SRC_TYP);
	public static final MCMeta no_del_flg_META = createCommonMeta($no_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta push_dpt_cd_META = createCommonMeta($push_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);

	protected static final ConstMetaList<Chk02_RsltR> constMetas = new ConstMetaList<Chk02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			mrkt_judg_no_META,
			upd_cntr_META,
			acpt_flg_META,
			not_acpt_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			mrkt_judg_role_cd_META,
			main_flg_META,
			judg_dt_META,
			judg_usr_cd_META,
			judg_dpt_cd_META,
			judg_rsn_META,
			intr_rmrks_META,
			mfg_so_aprv_typ_META,
			quality_mng_typ_META,
			mfg_mng_typ_META,
			deviant_typ_META,
			deviant_msr_typ_META,
			prod_itm_info_typ_META,
			chd_itm_info_typ_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			mrkt_judg_prnt_flg_META,
			mrkt_judg_prnt_tm_META,
			prnt_flg_META,
			aprv_dt_META,
			mrkt_judg_src_typ_META,
			no_del_flg_META,
			rtn_sts_typ_META,
			push_dpt_cd_META
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
				{$mrkt_judg_no, "E"}	// mrkt_judg_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$judg_dt, "E"},	// judg_dt
				{$judg_usr_cd, "E"},	// judg_usr_cd
				{$judg_dpt_cd, "E"},	// judg_dpt_cd
				{$judg_rsn, "E"}	// judg_rsn
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
				{$judg_dt, "bfToday"}	// judg_dt
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
				{$judg_usr_cd, "MA.MAUAL0010.Usr"},	// judg_usr_cd
				{$judg_dpt_cd, "MA.MAUAL0010.Dpt"}	// judg_dpt_cd
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
				{$judg_usr_cd, "true;judg_dt"},	// judg_usr_cd
				{$judg_dpt_cd, "judg_dt;judg_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$judg_usr_cd, "referring_usr_acl_flg;dt"},	// judg_usr_cd
				{$judg_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$mfg_so_aprv_typ, "MSC_MFG_SO_APRV_TYP"},	// mfg_so_aprv_typ
				{$quality_mng_typ, "MSC_QUALITY_MNG_TYP"},	// quality_mng_typ
				{$mfg_mng_typ, "MSC_MFG_MNG_TYP"},	// mfg_mng_typ
				{$deviant_typ, "MSC_DEVIANT_TYP"},	// deviant_typ
				{$deviant_msr_typ, "MSC_DEVIANT_MSR_TYP"},	// deviant_msr_typ
				{$prod_itm_info_typ, "MSC_PROD_ITM_INFO_TYP"},	// prod_itm_info_typ
				{$chd_itm_info_typ, "MSC_CHD_ITM_INFO_TYP"},	// chd_itm_info_typ
				{$mrkt_judg_sts_typ, "MSC_MRKT_JUDG_STS_TYP"}	// mrkt_judg_sts_typ
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
	protected Chk02_RsltR_MC_A(ConstMetaList<? extends Chk02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_RsltR clone() {
		return (Chk02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_RsltR createInstance() {
		return (Chk02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_RsltR getValues(String... names) {
		return (Chk02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_no() {
		return getConstString(offset + 2, $mrkt_judg_no);
	}

	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_no(String value) {
		setConstString(offset + 2, $mrkt_judg_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 3, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}


	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public boolean acpt_flg() {
		return getConstBoolean(offset + 4, $acpt_flg);
	}

	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public void acpt_flg(boolean value) {
		setConstBoolean(offset + 4, $acpt_flg, value);
	}


	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public boolean not_acpt_flg() {
		return getConstBoolean(offset + 5, $not_acpt_flg);
	}

	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public void not_acpt_flg(boolean value) {
		setConstBoolean(offset + 5, $not_acpt_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 10, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 10, $lot_no, value);
	}


	/**
	 * Market release approval role cd. 市場出荷承認役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 11, $mrkt_judg_role_cd);
	}

	/**
	 * Market release approval role cd. 市場出荷承認役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 11, $mrkt_judg_role_cd, value);
	}


	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public boolean main_flg() {
		return getConstBoolean(offset + 12, $main_flg);
	}

	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public void main_flg(boolean value) {
		setConstBoolean(offset + 12, $main_flg, value);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 13, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 13, $judg_dt, value);
	}


	/**
	 * Decision PIC 判定者.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 14, $judg_usr_cd);
	}

	/**
	 * Decision PIC 判定者.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 14, $judg_usr_cd, value);
	}


	/**
	 * Decision dept. 判定部門.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 15, $judg_dpt_cd);
	}

	/**
	 * Decision dept. 判定部門.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 15, $judg_dpt_cd, value);
	}


	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 16, $judg_rsn);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 16, $judg_rsn, value);
	}


	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 17, $intr_rmrks);
	}

	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 17, $intr_rmrks, value);
	}


	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public String mfg_so_aprv_typ() {
		return getConstString(offset + 18, $mfg_so_aprv_typ);
	}

	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public void mfg_so_aprv_typ(String value) {
		setConstString(offset + 18, $mfg_so_aprv_typ, value);
	}


	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public String quality_mng_typ() {
		return getConstString(offset + 19, $quality_mng_typ);
	}

	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public void quality_mng_typ(String value) {
		setConstString(offset + 19, $quality_mng_typ, value);
	}


	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public String mfg_mng_typ() {
		return getConstString(offset + 20, $mfg_mng_typ);
	}

	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public void mfg_mng_typ(String value) {
		setConstString(offset + 20, $mfg_mng_typ, value);
	}


	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public String deviant_typ() {
		return getConstString(offset + 21, $deviant_typ);
	}

	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public void deviant_typ(String value) {
		setConstString(offset + 21, $deviant_typ, value);
	}


	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public String deviant_msr_typ() {
		return getConstString(offset + 22, $deviant_msr_typ);
	}

	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public void deviant_msr_typ(String value) {
		setConstString(offset + 22, $deviant_msr_typ, value);
	}


	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public String prod_itm_info_typ() {
		return getConstString(offset + 23, $prod_itm_info_typ);
	}

	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public void prod_itm_info_typ(String value) {
		setConstString(offset + 23, $prod_itm_info_typ, value);
	}


	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public String chd_itm_info_typ() {
		return getConstString(offset + 24, $chd_itm_info_typ);
	}

	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public void chd_itm_info_typ(String value) {
		setConstString(offset + 24, $chd_itm_info_typ, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 25, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 25, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 26, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 26, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_prnt_flg() {
		return getConstBoolean(offset + 27, $mrkt_judg_prnt_flg);
	}

	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_prnt_flg(boolean value) {
		setConstBoolean(offset + 27, $mrkt_judg_prnt_flg, value);
	}


	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public MCDate mrkt_judg_prnt_tm() {
		return getConstDate(offset + 28, $mrkt_judg_prnt_tm);
	}

	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public void mrkt_judg_prnt_tm(MCDate value) {
		setConstDate(offset + 28, $mrkt_judg_prnt_tm, value);
	}


	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 29, $prnt_flg);
	}

	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 29, $prnt_flg, value);
	}


	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 30, $aprv_dt);
	}

	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 30, $aprv_dt, value);
	}


	/**
	 * Market release decision making based type 市場出荷判定作成元区分.<p>
	 *
	 */
	public String mrkt_judg_src_typ() {
		return getConstString(offset + 31, $mrkt_judg_src_typ);
	}

	/**
	 * Market release decision making based type 市場出荷判定作成元区分.<p>
	 *
	 */
	public void mrkt_judg_src_typ(String value) {
		setConstString(offset + 31, $mrkt_judg_src_typ, value);
	}


	/**
	 * Creation source cancel not possible 作成元取消不可.<p>
	 *
	 */
	public boolean no_del_flg() {
		return getConstBoolean(offset + 32, $no_del_flg);
	}

	/**
	 * Creation source cancel not possible 作成元取消不可.<p>
	 *
	 */
	public void no_del_flg(boolean value) {
		setConstBoolean(offset + 32, $no_del_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 33, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 33, $rtn_sts_typ, value);
	}


	/**
	 * Push notification dept. cd. プッシュ通知の部門ＣＤ.<p>
	 *
	 */
	public String push_dpt_cd() {
		return getConstString(offset + 34, $push_dpt_cd);
	}

	/**
	 * Push notification dept. cd. プッシュ通知の部門ＣＤ.<p>
	 *
	 */
	public void push_dpt_cd(String value) {
		setConstString(offset + 34, $push_dpt_cd, value);
	}


	public String getString(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_src_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			return push_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			return not_acpt_flg();
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			return main_flg();
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			return no_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_src_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			return push_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			return not_acpt_flg();
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			return main_flg();
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			return no_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			mrkt_judg_src_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			push_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			not_acpt_flg(value);
			return;
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			main_flg(value);
			return;
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			no_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			mrkt_judg_src_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			push_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			not_acpt_flg(value);
			return;
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			main_flg(value);
			return;
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			no_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

