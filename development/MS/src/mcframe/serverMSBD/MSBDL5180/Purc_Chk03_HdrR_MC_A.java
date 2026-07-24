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
 * ブロック"Purc_Chk03_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Purc_Chk03_HdrR_MC_A extends MCConstRow {

	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_chk_flg = "no_chk_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public static final String $io_make_flg = "io_make_flg";
	public static final String $pa = "pa";
	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * For subcontract flg. 下請対象ＦＬＧ.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";

	public static final String $purc_act_no = $pa + ".purc_act_no";
	public static final String $purc_act_seq = $pa + ".purc_act_seq";
	public static final String $trd_cd = $pa + ".trd_cd";
	public static final String $trd_ptn_typ = $pa + ".trd_ptn_typ";
	public static final String $po_no = $pa + ".po_no";
	public static final String $purc_dpt_cd = $pa + ".purc_dpt_cd";
	public static final String $purc_usr_cd = $pa + ".purc_usr_cd";
	public static final String $wg_cd = $pa + ".wg_cd";
	public static final String $sppl_cd = $pa + ".sppl_cd";
	public static final String $asppl_cd = $pa + ".asppl_cd";
	public static final String $bsppl_cd = $pa + ".bsppl_cd";
	public static final String $psppl_cd = $pa + ".psppl_cd";
	public static final String $cred_cd = $pa + ".cred_cd";
	public static final String $ptax_cur_cd = $pa + ".ptax_cur_cd";
	public static final String $base_cur_cd = $pa + ".base_cur_cd";
	public static final String $xrate_cd = $pa + ".xrate_cd";
	public static final String $ac_ym = $pa + ".ac_ym";
	public static final String $purc_ret_act_no = $pa + ".purc_ret_act_no";
	public static final String $purc_ret_act_rev = $pa + ".purc_ret_act_rev";
	public static final String $adjst_dt = $pa + ".adjst_dt";
	public static final String $purc_adjst_typ = $pa + ".purc_adjst_typ";
	public static final String $adjst_mtd_typ = $pa + ".adjst_mtd_typ";
	public static final String $purc_adjst_flg = $pa + ".purc_adjst_flg";
	public static final String $trd_cur_cd = $pa + ".trd_cur_cd";
	public static final String $trd_rmrks = $pa + ".trd_rmrks";
	public static final String $intr_rmrks = $pa + ".intr_rmrks";
	public static final String $tterm_cd1 = $pa + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $pa + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $pa + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $pa + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $pa + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $pa + ".tterm_rmrks3";
	public static final String $sub_char1 = $pa + ".sub_char1";
	public static final String $sub_char2 = $pa + ".sub_char2";
	public static final String $sub_char3 = $pa + ".sub_char3";
	public static final String $purc_dt = $pa + ".purc_dt";
	public static final String $ac_dt = $pa + ".ac_dt";
	public static final String $pay_basis_dt = $pa + ".pay_basis_dt";
	public static final String $pay_schd_dt = $pa + ".pay_schd_dt";
	public static final String $rcpt_iv_no = $pa + ".rcpt_iv_no";
	public static final String $rcpt_iv_mng_no = $pa + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_rev = $pa + ".rcpt_iv_rev";
	public static final String $ref_rcpt_iv_no = $pa + ".ref_rcpt_iv_no";
	public static final String $xrate = $pa + ".xrate";
	public static final String $ptax_dt = $pa + ".ptax_dt";
	public static final String $ptax_xrate = $pa + ".ptax_xrate";

	public static final MCMeta no_chk_flg_META = createCommonMeta($no_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_make_flg_META = createCommonMeta($io_make_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pa_META = createInnerRowMeta($pa, mcframe.serverMS.dbc.MST_PURC_ACT_R.class);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Purc_Chk03_HdrR> constMetas = new ConstMetaList<Purc_Chk03_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			no_chk_flg_META,
			data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			io_make_flg_META,
			pa_META,
			aprv_flg_META,
			aprv_no_META,
			subcon_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			can_ac_dt_META,
			fix_flg_META
		},
		new String[][]{
			{
				"purc_act_no",
				"purc_act_seq",
				"trd_cd",
				"trd_ptn_typ",
				"po_no",
				"purc_dpt_cd",
				"purc_usr_cd",
				"wg_cd",
				"sppl_cd",
				"asppl_cd",
				"bsppl_cd",
				"psppl_cd",
				"cred_cd",
				"ptax_cur_cd",
				"base_cur_cd",
				"xrate_cd",
				"ac_ym",
				"purc_ret_act_no",
				"purc_ret_act_rev",
				"adjst_dt",
				"purc_adjst_typ",
				"adjst_mtd_typ",
				"purc_adjst_flg",
				"trd_cur_cd",
				"trd_rmrks",
				"intr_rmrks",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"purc_dt",
				"ac_dt",
				"pay_basis_dt",
				"pay_schd_dt",
				"rcpt_iv_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_rev",
				"ref_rcpt_iv_no",
				"xrate",
				"ptax_dt",
				"ptax_xrate"
			},
			{
				$purc_act_no,
				$purc_act_seq,
				$trd_cd,
				$trd_ptn_typ,
				$po_no,
				$purc_dpt_cd,
				$purc_usr_cd,
				$wg_cd,
				$sppl_cd,
				$asppl_cd,
				$bsppl_cd,
				$psppl_cd,
				$cred_cd,
				$ptax_cur_cd,
				$base_cur_cd,
				$xrate_cd,
				$ac_ym,
				$purc_ret_act_no,
				$purc_ret_act_rev,
				$adjst_dt,
				$purc_adjst_typ,
				$adjst_mtd_typ,
				$purc_adjst_flg,
				$trd_cur_cd,
				$trd_rmrks,
				$intr_rmrks,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$purc_dt,
				$ac_dt,
				$pay_basis_dt,
				$pay_schd_dt,
				$rcpt_iv_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_rev,
				$ref_rcpt_iv_no,
				$xrate,
				$ptax_dt,
				$ptax_xrate
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
	protected Purc_Chk03_HdrR_MC_A(ConstMetaList<? extends Purc_Chk03_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_HdrR clone() {
		return (Purc_Chk03_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_HdrR createInstance() {
		return (Purc_Chk03_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_HdrR getValues(String... names) {
		return (Purc_Chk03_HdrR) super.getValues(names);
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
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 3, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 3, $err_flg, value);
	}


	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public boolean io_make_flg() {
		return getConstBoolean(offset + 4, $io_make_flg);
	}

	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public void io_make_flg(boolean value) {
		setConstBoolean(offset + 4, $io_make_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PURC_ACT_R pa(){
		return (mcframe.serverMS.dbc.MST_PURC_ACT_R) getConstInnerRow(offset + 5, $pa);
	}
	
	public void pa(mcframe.serverMS.dbc.MST_PURC_ACT_R row){
		setConstInnerRow(offset + 5, $pa, row);
	}


	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 6, $aprv_flg);
	}

	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 6, $aprv_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 7, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 7, $aprv_no, value);
	}


	/**
	 * For subcontract flg. 下請対象ＦＬＧ.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 8, $subcon_flg);
	}

	/**
	 * For subcontract flg. 下請対象ＦＬＧ.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 8, $subcon_flg, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 9, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 9, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 10, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 10, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 11, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 11, $purc_tax_calc_typ, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 12, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 12, $can_ac_dt, value);
	}


	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 13, $fix_flg);
	}

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 13, $fix_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			return no_chk_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($io_make_flg.equalsIgnoreCase(name)) {
			return io_make_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			return no_chk_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($io_make_flg.equalsIgnoreCase(name)) {
			return io_make_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			no_chk_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($io_make_flg.equalsIgnoreCase(name)) {
			io_make_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			no_chk_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($io_make_flg.equalsIgnoreCase(name)) {
			io_make_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pa.equalsIgnoreCase(name)) {
			return pa();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pa.equalsIgnoreCase(name)) {
			pa(
				((MCContainerMeta) pa_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return pa().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		pa().purc_act_no(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return pa().purc_act_seq();
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		pa().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		pa().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		pa().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		pa().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		pa().purc_act_seq(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return pa().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		pa().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return pa().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		pa().trd_ptn_typ(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return pa().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		pa().po_no(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return pa().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		pa().purc_dpt_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return pa().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		pa().purc_usr_cd(value);
	}

	/**
	 * WG cd. ＷＧ　ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return pa().wg_cd();
	}

	/**
	 * WG cd. ＷＧ　ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		pa().wg_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return pa().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		pa().sppl_cd(value);
	}

	public String asppl_cd() {
		return pa().asppl_cd();
	}

	public void asppl_cd(String value) {
		pa().asppl_cd(value);
	}

	public String bsppl_cd() {
		return pa().bsppl_cd();
	}

	public void bsppl_cd(String value) {
		pa().bsppl_cd(value);
	}

	public String psppl_cd() {
		return pa().psppl_cd();
	}

	public void psppl_cd(String value) {
		pa().psppl_cd(value);
	}

	public String cred_cd() {
		return pa().cred_cd();
	}

	public void cred_cd(String value) {
		pa().cred_cd(value);
	}

	public String ptax_cur_cd() {
		return pa().ptax_cur_cd();
	}

	public void ptax_cur_cd(String value) {
		pa().ptax_cur_cd(value);
	}

	public String base_cur_cd() {
		return pa().base_cur_cd();
	}

	public void base_cur_cd(String value) {
		pa().base_cur_cd(value);
	}

	public String xrate_cd() {
		return pa().xrate_cd();
	}

	public void xrate_cd(String value) {
		pa().xrate_cd(value);
	}

	public MCDate ac_ym() {
		return pa().ac_ym();
	}

	public void ac_ym(MCDate value) {
		pa().ac_ym(value);
	}

	public String purc_ret_act_no() {
		return pa().purc_ret_act_no();
	}

	public void purc_ret_act_no(String value) {
		pa().purc_ret_act_no(value);
	}

	public MCNumber purc_ret_act_rev() {
		return pa().purc_ret_act_rev();
	}

	public void purc_ret_act_rev(MCNumber value) {
		pa().purc_ret_act_rev(value);
	}

	public void purc_ret_act_rev(int value) {
		pa().purc_ret_act_rev(value);
	}

	public void purc_ret_act_rev(long value) {
		pa().purc_ret_act_rev(value);
	}

	public void purc_ret_act_rev(float value) {
		pa().purc_ret_act_rev(value);
	}

	public void purc_ret_act_rev(double value) {
		pa().purc_ret_act_rev(value);
	}

	public MCDate adjst_dt() {
		return pa().adjst_dt();
	}

	public void adjst_dt(MCDate value) {
		pa().adjst_dt(value);
	}

	public String purc_adjst_typ() {
		return pa().purc_adjst_typ();
	}

	public void purc_adjst_typ(String value) {
		pa().purc_adjst_typ(value);
	}

	public String adjst_mtd_typ() {
		return pa().adjst_mtd_typ();
	}

	public void adjst_mtd_typ(String value) {
		pa().adjst_mtd_typ(value);
	}

	public boolean purc_adjst_flg() {
		return pa().purc_adjst_flg();
	}

	public void purc_adjst_flg(boolean value) {
		pa().purc_adjst_flg(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return pa().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		pa().trd_cur_cd(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return pa().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		pa().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return pa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		pa().intr_rmrks(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return pa().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		pa().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return pa().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		pa().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return pa().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		pa().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return pa().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		pa().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return pa().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		pa().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return pa().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		pa().tterm_rmrks3(value);
	}

	/**
	 * Spare column 1 予備項目１.<p>
	 *
	 */
	public String sub_char1() {
		return pa().sub_char1();
	}

	/**
	 * Spare column 1 予備項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pa().sub_char1(value);
	}

	/**
	 * Spare column 2 予備項目２.<p>
	 *
	 */
	public String sub_char2() {
		return pa().sub_char2();
	}

	/**
	 * Spare column 2 予備項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pa().sub_char2(value);
	}

	/**
	 * Spare column 3 予備項目３.<p>
	 *
	 */
	public String sub_char3() {
		return pa().sub_char3();
	}

	/**
	 * Spare column 3 予備項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pa().sub_char3(value);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return pa().purc_dt();
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		pa().purc_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return pa().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		pa().ac_dt(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return pa().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		pa().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return pa().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		pa().pay_schd_dt(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return pa().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		pa().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return pa().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		pa().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return pa().rcpt_iv_rev();
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Corresponding purchase I/V No. 対応受領インボイスＮＯ.<p>
	 *
	 */
	public String ref_rcpt_iv_no() {
		return pa().ref_rcpt_iv_no();
	}

	/**
	 * Corresponding purchase I/V No. 対応受領インボイスＮＯ.<p>
	 *
	 */
	public void ref_rcpt_iv_no(String value) {
		pa().ref_rcpt_iv_no(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return pa().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		pa().xrate(value);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return pa().ptax_dt();
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		pa().ptax_dt(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return pa().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		pa().ptax_xrate(value);
	}

}

