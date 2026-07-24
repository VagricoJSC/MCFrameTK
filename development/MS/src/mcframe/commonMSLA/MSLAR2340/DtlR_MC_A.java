package mcframe.commonMSLA.MSLAR2340;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 *  データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public static final String $trd_typ_cd = "trd_typ_cd";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 *  オーダ区分.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 *  親品目オーダＮＯ.<p>
	 *
	 */
	public static final String $par_itm_ord_no = "par_itm_ord_no";
	/**
	 *  親工程オーダＮＯ.<p>
	 *
	 */
	public static final String $par_oper_ord_no = "par_oper_ord_no";
	/**
	 *  工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 *  工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 *  工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 *  カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 *  検査オフセット.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";


	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta trd_typ_cd_META = createCommonMeta($trd_typ_cd, mcframe.commonMA.meta.MA_META.IF_TRD_TYP_CD);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta par_itm_ord_no_META = createCommonMeta($par_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta par_oper_ord_no_META = createCommonMeta($par_oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			trd_typ_cd_META,
			data_make_dt_META,
			data_crud_typ_META,
			wg_cd_META,
			itm_ord_typ_META,
			itm_ord_no_META,
			par_itm_ord_no_META,
			par_oper_ord_no_META,
			oper_ptn_META,
			oper_cd_META,
			oper_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			cal_cd_META,
			xfr_lt_META,
			insp_offst_META,
			insp_lt_META,
			accpt_insp_lt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	/**
	 *  データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}


	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public String trd_typ_cd() {
		return getConstString(offset + 2, $trd_typ_cd);
	}

	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public void trd_typ_cd(String value) {
		setConstString(offset + 2, $trd_typ_cd, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 3, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 3, $data_make_dt, value);
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	/**
	 *  ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 *  ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 *  オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 6, $itm_ord_typ);
	}

	/**
	 *  オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 6, $itm_ord_typ, value);
	}


	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 7, $itm_ord_no);
	}

	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 7, $itm_ord_no, value);
	}


	/**
	 *  親品目オーダＮＯ.<p>
	 *
	 */
	public String par_itm_ord_no() {
		return getConstString(offset + 8, $par_itm_ord_no);
	}

	/**
	 *  親品目オーダＮＯ.<p>
	 *
	 */
	public void par_itm_ord_no(String value) {
		setConstString(offset + 8, $par_itm_ord_no, value);
	}


	/**
	 *  親工程オーダＮＯ.<p>
	 *
	 */
	public String par_oper_ord_no() {
		return getConstString(offset + 9, $par_oper_ord_no);
	}

	/**
	 *  親工程オーダＮＯ.<p>
	 *
	 */
	public void par_oper_ord_no(String value) {
		setConstString(offset + 9, $par_oper_ord_no, value);
	}


	/**
	 *  工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 10, $oper_ptn);
	}

	/**
	 *  工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 10, $oper_ptn, value);
	}


	/**
	 *  工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 11, $oper_cd);
	}

	/**
	 *  工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 11, $oper_cd, value);
	}


	/**
	 *  工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 12, $oper_seq);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 12, $oper_seq, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 13, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 13, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 14, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 14, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 15, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 15, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 16, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 16, $itm_sub3, value);
	}


	/**
	 *  カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 17, $cal_cd);
	}

	/**
	 *  カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 17, $cal_cd, value);
	}


	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 18, $xfr_lt);
	}

	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}

	/**
	 *  移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 18, $xfr_lt, value);
	}


	/**
	 *  検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 19, $insp_offst);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 19, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 19, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 19, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 19, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 19, $insp_offst, value);
	}


	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 20, $insp_lt);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 20, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 20, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 20, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 20, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 20, $insp_lt, value);
	}


	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 21, $accpt_insp_lt);
	}

	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 21, $accpt_insp_lt, value);
	}

	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 21, $accpt_insp_lt, value);
	}

	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 21, $accpt_insp_lt, value);
	}

	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 21, $accpt_insp_lt, value);
	}

	/**
	 *  検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 21, $accpt_insp_lt, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 22, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 22, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 23, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 23, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 24, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 24, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 25, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 25, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 26, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 26, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 27, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 27, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 28, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 28, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 29, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 29, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 30, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 30, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 31, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 31, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 32, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 32, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 33, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 33, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 34, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 34, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 35, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 35, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 36, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 36, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 37, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 37, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 38, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 38, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 39, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 39, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 40, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 40, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 41, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 41, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 42, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 42, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 43, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 43, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 44, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 44, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 45, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 45, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 46, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 46, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 47, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 47, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 48, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 48, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 49, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 49, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 50, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 50, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 51, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 51, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 52, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 52, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 52, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 52, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 52, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 52, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 53, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 53, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 53, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 53, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 53, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 53, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 54, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 54, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 54, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 54, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 54, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 54, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 55, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 55, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 55, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 55, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 55, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 55, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 56, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 56, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 56, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 56, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 56, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 56, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 57, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 57, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 58, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 58, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 59, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 59, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 60, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 60, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 61, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 61, $sub_dt5, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			return par_itm_ord_no();
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			return par_oper_ord_no();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			return par_itm_ord_no();
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			return par_oper_ord_no();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			par_itm_ord_no(value);
			return;
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			par_oper_ord_no(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($par_itm_ord_no.equalsIgnoreCase(name)) {
			par_itm_ord_no(value);
			return;
		}
		if ($par_oper_ord_no.equalsIgnoreCase(name)) {
			par_oper_ord_no(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

