package mcframe.serverMSBF.MSBFL5020;

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
 * ブロック"InspInst_Ins01_RsltStd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspInst_Ins01_RsltStdR_MC_A extends MCConstRow {

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public static final String $peg_no_hdr = "peg_no_hdr";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_inst_no = "std_insp_inst_no";
	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public static final String $insp_seq = "insp_seq";
	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public static final String $insp_point_cd = "insp_point_cd";
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public static final String $ql_std_val = "ql_std_val";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public static final String $qn_int_digit = "qn_int_digit";
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public static final String $qn_int_frac = "qn_int_frac";
	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public static final String $qn_out_min = "qn_out_min";
	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_out_min_typ = "sign_out_min_typ";
	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public static final String $qn_in_min = "qn_in_min";
	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_in_min_typ = "sign_in_min_typ";
	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_in_max_typ = "sign_in_max_typ";
	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public static final String $qn_in_max = "qn_in_max";
	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_out_max_typ = "sign_out_max_typ";
	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public static final String $qn_out_max = "qn_out_max";
	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Additional column flg. 追加項目ＦＬＧ.<p>
	 *
	 */
	public static final String $add_point_flg = "add_point_flg";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";


	public static final MCMeta peg_no_hdr_META = createCommonMeta($peg_no_hdr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta std_insp_inst_no_META = createCommonMeta($std_insp_inst_no, mcframe.commonMA.meta.MA_META.STD_INSP_INST_NO);
	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qn_int_digit_META = createCommonMeta($qn_int_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qn_out_min_META = createCommonMeta($qn_out_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta qn_in_min_META = createCommonMeta($qn_in_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta qn_in_max_META = createCommonMeta($qn_in_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta qn_out_max_META = createCommonMeta($qn_out_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR3);
	public static final MCMeta add_point_flg_META = createCommonMeta($add_point_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);

	protected static final ConstMetaList<InspInst_Ins01_RsltStdR> constMetas = new ConstMetaList<InspInst_Ins01_RsltStdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_hdr_META,
			peg_no_META,
			std_insp_inst_no_META,
			insp_seq_META,
			insp_point_cd_META,
			insp_qlqn_typ_META,
			ql_std_val_META,
			trd_unit_cd_META,
			qn_int_digit_META,
			qn_int_frac_META,
			qn_out_min_META,
			sign_out_min_typ_META,
			qn_in_min_META,
			sign_in_min_typ_META,
			sign_in_max_typ_META,
			qn_in_max_META,
			sign_out_max_typ_META,
			qn_out_max_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			add_point_flg_META,
			insp_no_META,
			insp_sts_typ_META,
			insp_mtd_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected InspInst_Ins01_RsltStdR_MC_A(ConstMetaList<? extends InspInst_Ins01_RsltStdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Ins01_RsltStdR clone() {
		return (InspInst_Ins01_RsltStdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Ins01_RsltStdR createInstance() {
		return (InspInst_Ins01_RsltStdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Ins01_RsltStdR getValues(String... names) {
		return (InspInst_Ins01_RsltStdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public MCNumber peg_no_hdr() {
		return getConstNumber(offset + 0, $peg_no_hdr);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(MCNumber value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(int value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(long value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(float value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(double value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public String std_insp_inst_no() {
		return getConstString(offset + 2, $std_insp_inst_no);
	}

	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public void std_insp_inst_no(String value) {
		setConstString(offset + 2, $std_insp_inst_no, value);
	}


	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public MCNumber insp_seq() {
		return getConstNumber(offset + 3, $insp_seq);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(MCNumber value) {
		setConstNumber(offset + 3, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(int value) {
		setConstNumber(offset + 3, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(long value) {
		setConstNumber(offset + 3, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(float value) {
		setConstNumber(offset + 3, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(double value) {
		setConstNumber(offset + 3, $insp_seq, value);
	}


	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public String insp_point_cd() {
		return getConstString(offset + 4, $insp_point_cd);
	}

	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public void insp_point_cd(String value) {
		setConstString(offset + 4, $insp_point_cd, value);
	}


	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 5, $insp_qlqn_typ);
	}

	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 5, $insp_qlqn_typ, value);
	}


	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public String ql_std_val() {
		return getConstString(offset + 6, $ql_std_val);
	}

	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public void ql_std_val(String value) {
		setConstString(offset + 6, $ql_std_val, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 7, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 7, $trd_unit_cd, value);
	}


	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 8, $qn_int_digit);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 8, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 8, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 8, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 8, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 8, $qn_int_digit, value);
	}


	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 9, $qn_int_frac);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 9, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 9, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 9, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 9, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 9, $qn_int_frac, value);
	}


	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return getConstNumber(offset + 10, $qn_out_min);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		setConstNumber(offset + 10, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(int value) {
		setConstNumber(offset + 10, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(long value) {
		setConstNumber(offset + 10, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(float value) {
		setConstNumber(offset + 10, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(double value) {
		setConstNumber(offset + 10, $qn_out_min, value);
	}


	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 11, $sign_out_min_typ);
	}

	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 11, $sign_out_min_typ, value);
	}


	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return getConstNumber(offset + 12, $qn_in_min);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(int value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(long value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(float value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(double value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}


	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 13, $sign_in_min_typ);
	}

	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 13, $sign_in_min_typ, value);
	}


	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 14, $sign_in_max_typ);
	}

	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 14, $sign_in_max_typ, value);
	}


	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return getConstNumber(offset + 15, $qn_in_max);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		setConstNumber(offset + 15, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(int value) {
		setConstNumber(offset + 15, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(long value) {
		setConstNumber(offset + 15, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(float value) {
		setConstNumber(offset + 15, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(double value) {
		setConstNumber(offset + 15, $qn_in_max, value);
	}


	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 16, $sign_out_max_typ);
	}

	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 16, $sign_out_max_typ, value);
	}


	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return getConstNumber(offset + 17, $qn_out_max);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		setConstNumber(offset + 17, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(int value) {
		setConstNumber(offset + 17, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(long value) {
		setConstNumber(offset + 17, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(float value) {
		setConstNumber(offset + 17, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(double value) {
		setConstNumber(offset + 17, $qn_out_max, value);
	}


	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 18, $intr_rmrks);
	}

	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 18, $intr_rmrks, value);
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


	/**
	 * Additional column flg. 追加項目ＦＬＧ.<p>
	 *
	 */
	public boolean add_point_flg() {
		return getConstBoolean(offset + 22, $add_point_flg);
	}

	/**
	 * Additional column flg. 追加項目ＦＬＧ.<p>
	 *
	 */
	public void add_point_flg(boolean value) {
		setConstBoolean(offset + 22, $add_point_flg, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 23, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 23, $insp_no, value);
	}


	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 24, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 24, $insp_sts_typ, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 25, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 25, $insp_mtd_typ, value);
	}


	public String getString(String name) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			return peg_no_hdr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($add_point_flg.equalsIgnoreCase(name)) {
			return add_point_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			return peg_no_hdr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($add_point_flg.equalsIgnoreCase(name)) {
			return add_point_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($add_point_flg.equalsIgnoreCase(name)) {
			add_point_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($add_point_flg.equalsIgnoreCase(name)) {
			add_point_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

