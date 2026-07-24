package mcframe.serverMSBB.MSBBL6020;

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
 * ブロック"Slo_Upd01_DtlSpec"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_Upd01_DtlSpecR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Sales item specification detail No. 販売品目仕様項目ＮＯ.<p>
	 *
	 */
	public static final String $spec_desc_no = "spec_desc_no";
	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_spec_no = "sls_itm_spec_no";
	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_no = "sls_itm_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Specification row No. 仕様行ＮＯ.<p>
	 *
	 */
	public static final String $slo_itm_spec_lno = "slo_itm_spec_lno";
	/**
	 * Configuration row No. 構成行ＮＯ.<p>
	 *
	 */
	public static final String $slo_itm_comp_lno = "slo_itm_comp_lno";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public static final String $spec_cd = "spec_cd";
	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public static final String $spec_desc_cd = "spec_desc_cd";
	/**
	 * Specification detail remarks 仕様項目備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	/**
	 * Sales item configuration specification detail No. 販売品目構成仕様項目ＮＯ.<p>
	 *
	 */
	public static final String $comp_spec_desc_no = "comp_spec_desc_no";
	/**
	 * Numbering 発番済.<p>
	 *
	 */
	public static final String $seq_flg = "seq_flg";
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta spec_desc_no_META = createCommonMeta($spec_desc_no, mcframe.commonMA.meta.MA_META.SPEC_DESC_NO);
	public static final MCMeta sls_itm_spec_no_META = createCommonMeta($sls_itm_spec_no, mcframe.commonMA.meta.MA_META.SLS_ITM_SPEC_NO);
	public static final MCMeta sls_itm_no_META = createCommonMeta($sls_itm_no, mcframe.commonMA.meta.MA_META.SLS_ITM_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_itm_spec_lno_META = createCommonMeta($slo_itm_spec_lno, mcframe.commonMA.meta.MA_META.ITM_SPEC_LNO);
	public static final MCMeta slo_itm_comp_lno_META = createCommonMeta($slo_itm_comp_lno, mcframe.commonMA.meta.MA_META.ITM_COMP_LNO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta spec_cd_META = createCommonMeta($spec_cd, mcframe.commonMA.meta.MA_META.SPEC_CD);
	public static final MCMeta spec_desc_cd_META = createCommonMeta($spec_desc_cd, mcframe.commonMA.meta.MA_META.SPEC_DESC_CD);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMS.meta.MS_META.SPEC_DESC_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SPEC_DESC_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SPEC_DESC_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SPEC_DESC_SUB_CHAR3);
	public static final MCMeta comp_spec_desc_no_META = createCommonMeta($comp_spec_desc_no, mcframe.commonMA.meta.MA_META.COMP_SPEC_DESC_NO);
	public static final MCMeta seq_flg_META = createCommonMeta($seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Slo_Upd01_DtlSpecR> constMetas = new ConstMetaList<Slo_Upd01_DtlSpecR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			spec_desc_no_META,
			sls_itm_spec_no_META,
			sls_itm_no_META,
			slo_d_no_META,
			slo_itm_spec_lno_META,
			slo_itm_comp_lno_META,
			itm_cd_META,
			itm_nm_META,
			spec_cd_META,
			spec_desc_cd_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			comp_spec_desc_no_META,
			seq_flg_META,
			err_flg_META,
			peg_no_META,
			hdr_peg_no_META
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$slo_itm_spec_lno, "E"},	// slo_itm_spec_lno
				{$spec_cd, "E"},	// spec_cd
				{$spec_desc_cd, "E"}	// spec_desc_cd
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
				{$spec_cd, "MA.MAUAL0010.Spec"},	// spec_cd
				{$spec_desc_cd, "MA.MAUAL0010.SpecDesc"}	// spec_desc_cd
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
	protected Slo_Upd01_DtlSpecR_MC_A(ConstMetaList<? extends Slo_Upd01_DtlSpecR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlSpecR clone() {
		return (Slo_Upd01_DtlSpecR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlSpecR createInstance() {
		return (Slo_Upd01_DtlSpecR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlSpecR getValues(String... names) {
		return (Slo_Upd01_DtlSpecR) super.getValues(names);
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
	 * Sales item specification detail No. 販売品目仕様項目ＮＯ.<p>
	 *
	 */
	public String spec_desc_no() {
		return getConstString(offset + 1, $spec_desc_no);
	}

	/**
	 * Sales item specification detail No. 販売品目仕様項目ＮＯ.<p>
	 *
	 */
	public void spec_desc_no(String value) {
		setConstString(offset + 1, $spec_desc_no, value);
	}


	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public String sls_itm_spec_no() {
		return getConstString(offset + 2, $sls_itm_spec_no);
	}

	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public void sls_itm_spec_no(String value) {
		setConstString(offset + 2, $sls_itm_spec_no, value);
	}


	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public String sls_itm_no() {
		return getConstString(offset + 3, $sls_itm_no);
	}

	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public void sls_itm_no(String value) {
		setConstString(offset + 3, $sls_itm_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 4, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 4, $slo_d_no, value);
	}


	/**
	 * Specification row No. 仕様行ＮＯ.<p>
	 *
	 */
	public String slo_itm_spec_lno() {
		return getConstString(offset + 5, $slo_itm_spec_lno);
	}

	/**
	 * Specification row No. 仕様行ＮＯ.<p>
	 *
	 */
	public void slo_itm_spec_lno(String value) {
		setConstString(offset + 5, $slo_itm_spec_lno, value);
	}


	/**
	 * Configuration row No. 構成行ＮＯ.<p>
	 *
	 */
	public String slo_itm_comp_lno() {
		return getConstString(offset + 6, $slo_itm_comp_lno);
	}

	/**
	 * Configuration row No. 構成行ＮＯ.<p>
	 *
	 */
	public void slo_itm_comp_lno(String value) {
		setConstString(offset + 6, $slo_itm_comp_lno, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 8, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 8, $itm_nm, value);
	}


	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public String spec_cd() {
		return getConstString(offset + 9, $spec_cd);
	}

	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public void spec_cd(String value) {
		setConstString(offset + 9, $spec_cd, value);
	}


	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public String spec_desc_cd() {
		return getConstString(offset + 10, $spec_desc_cd);
	}

	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public void spec_desc_cd(String value) {
		setConstString(offset + 10, $spec_desc_cd, value);
	}


	/**
	 * Specification detail remarks 仕様項目備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 11, $rmrks);
	}

	/**
	 * Specification detail remarks 仕様項目備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 11, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 12, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 12, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 13, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 13, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 14, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 14, $sub_char3, value);
	}


	/**
	 * Sales item configuration specification detail No. 販売品目構成仕様項目ＮＯ.<p>
	 *
	 */
	public String comp_spec_desc_no() {
		return getConstString(offset + 15, $comp_spec_desc_no);
	}

	/**
	 * Sales item configuration specification detail No. 販売品目構成仕様項目ＮＯ.<p>
	 *
	 */
	public void comp_spec_desc_no(String value) {
		setConstString(offset + 15, $comp_spec_desc_no, value);
	}


	/**
	 * Numbering 発番済.<p>
	 *
	 */
	public boolean seq_flg() {
		return getConstBoolean(offset + 16, $seq_flg);
	}

	/**
	 * Numbering 発番済.<p>
	 *
	 */
	public void seq_flg(boolean value) {
		setConstBoolean(offset + 16, $seq_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 17, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 17, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 18, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 18, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 18, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 18, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 18, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 18, $peg_no, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 19, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 19, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 19, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 19, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 19, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 19, $hdr_peg_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			return spec_desc_no();
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			return sls_itm_spec_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			return slo_itm_spec_lno();
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			return slo_itm_comp_lno();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			return spec_cd();
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			return spec_desc_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			return comp_spec_desc_no();
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
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($seq_flg.equalsIgnoreCase(name)) {
			return seq_flg();
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
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			return spec_desc_no();
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			return sls_itm_spec_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			return slo_itm_spec_lno();
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			return slo_itm_comp_lno();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			return spec_cd();
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			return spec_desc_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			return comp_spec_desc_no();
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
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($seq_flg.equalsIgnoreCase(name)) {
			return seq_flg();
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
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			spec_desc_no(value);
			return;
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			sls_itm_spec_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			slo_itm_spec_lno(value);
			return;
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			slo_itm_comp_lno(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			spec_cd(value);
			return;
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			spec_desc_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			comp_spec_desc_no(value);
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
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($seq_flg.equalsIgnoreCase(name)) {
			seq_flg(value);
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
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			spec_desc_no(value);
			return;
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			sls_itm_spec_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			slo_itm_spec_lno(value);
			return;
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			slo_itm_comp_lno(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			spec_cd(value);
			return;
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			spec_desc_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			comp_spec_desc_no(value);
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
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($seq_flg.equalsIgnoreCase(name)) {
			seq_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

