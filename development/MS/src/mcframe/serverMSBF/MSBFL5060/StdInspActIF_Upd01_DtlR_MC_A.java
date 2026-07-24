package mcframe.serverMSBF.MSBFL5060;

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
 * ブロック"StdInspActIF_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StdInspActIF_Upd01_DtlR_MC_A extends MCConstRow {

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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_act_no = "std_insp_act_no";
	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_inst_no = "std_insp_inst_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public static final String $qn_insp_val = "qn_insp_val";
	/**
	 * Update quantitative inspection value 定量検査値更新.<p>
	 *
	 */
	public static final String $qn_insp_val_upd_flg = "qn_insp_val_upd_flg";
	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public static final String $ql_insp_val = "ql_insp_val";
	/**
	 * Update qualitative inspection value 定性検査値更新.<p>
	 *
	 */
	public static final String $ql_insp_val_upd_flg = "ql_insp_val_upd_flg";
	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	/**
	 * Update inspection start time 検査開始日時更新.<p>
	 *
	 */
	public static final String $st_tm_upd_flg = "st_tm_upd_flg";
	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	/**
	 * Update inspection end time 検査終了日時更新.<p>
	 *
	 */
	public static final String $end_tm_upd_flg = "end_tm_upd_flg";
	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Update inspection PIC cd. 検査者ＣＤ更新.<p>
	 *
	 */
	public static final String $usr_cd_upd_flg = "usr_cd_upd_flg";
	/**
	 * Dept. cd. of inspection PIC 検査者部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Update dept. cd. of inspection PIC 検査者部門ＣＤ更新.<p>
	 *
	 */
	public static final String $dpt_cd_upd_flg = "dpt_cd_upd_flg";
	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ = "std_insp_rslt_typ";
	/**
	 * Update inspection result type 判定結果区分更新.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ_upd_flg = "std_insp_rslt_typ_upd_flg";
	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Update specific inspection result internal remarks 規格検査実績内部備考更新.<p>
	 *
	 */
	public static final String $act_intr_rmrks_upd_flg = "act_intr_rmrks_upd_flg";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public static final String $sub_char1_upd_flg = "sub_char1_upd_flg";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public static final String $sub_char2_upd_flg = "sub_char2_upd_flg";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public static final String $sub_char3_upd_flg = "sub_char3_upd_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta std_insp_act_no_META = createCommonMeta($std_insp_act_no, mcframe.commonMA.meta.MA_META.STD_INSP_ACT_NO);
	public static final MCMeta std_insp_inst_no_META = createCommonMeta($std_insp_inst_no, mcframe.commonMA.meta.MA_META.STD_INSP_INST_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta qn_insp_val_META = createCommonMeta($qn_insp_val, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta qn_insp_val_upd_flg_META = createCommonMeta($qn_insp_val_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ql_insp_val_META = createCommonMeta($ql_insp_val, mcframe.commonMS.meta.MS_META.QL_INSP_VAL);
	public static final MCMeta ql_insp_val_upd_flg_META = createCommonMeta($ql_insp_val_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_tm_upd_flg_META = createCommonMeta($st_tm_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_upd_flg_META = createCommonMeta($end_tm_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_cd_upd_flg_META = createCommonMeta($usr_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_cd_upd_flg_META = createCommonMeta($dpt_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_rslt_typ_META = createCommonMeta($std_insp_rslt_typ, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP);
	public static final MCMeta std_insp_rslt_typ_upd_flg_META = createCommonMeta($std_insp_rslt_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_INTR_RMRKS);
	public static final MCMeta act_intr_rmrks_upd_flg_META = createCommonMeta($act_intr_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char1_upd_flg_META = createCommonMeta($sub_char1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char2_upd_flg_META = createCommonMeta($sub_char2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR3);
	public static final MCMeta sub_char3_upd_flg_META = createCommonMeta($sub_char3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<StdInspActIF_Upd01_DtlR> constMetas = new ConstMetaList<StdInspActIF_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			std_insp_act_no_META,
			std_insp_inst_no_META,
			insp_no_META,
			qn_insp_val_META,
			qn_insp_val_upd_flg_META,
			ql_insp_val_META,
			ql_insp_val_upd_flg_META,
			st_tm_META,
			st_tm_upd_flg_META,
			end_tm_META,
			end_tm_upd_flg_META,
			usr_cd_META,
			usr_cd_upd_flg_META,
			dpt_cd_META,
			dpt_cd_upd_flg_META,
			std_insp_rslt_typ_META,
			std_insp_rslt_typ_upd_flg_META,
			act_intr_rmrks_META,
			act_intr_rmrks_upd_flg_META,
			sub_char1_META,
			sub_char1_upd_flg_META,
			sub_char2_META,
			sub_char2_upd_flg_META,
			sub_char3_META,
			sub_char3_upd_flg_META
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
	protected StdInspActIF_Upd01_DtlR_MC_A(ConstMetaList<? extends StdInspActIF_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspActIF_Upd01_DtlR clone() {
		return (StdInspActIF_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspActIF_Upd01_DtlR createInstance() {
		return (StdInspActIF_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspActIF_Upd01_DtlR getValues(String... names) {
		return (StdInspActIF_Upd01_DtlR) super.getValues(names);
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
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public String std_insp_act_no() {
		return getConstString(offset + 3, $std_insp_act_no);
	}

	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public void std_insp_act_no(String value) {
		setConstString(offset + 3, $std_insp_act_no, value);
	}


	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public String std_insp_inst_no() {
		return getConstString(offset + 4, $std_insp_inst_no);
	}

	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public void std_insp_inst_no(String value) {
		setConstString(offset + 4, $std_insp_inst_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 5, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 5, $insp_no, value);
	}


	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public MCNumber qn_insp_val() {
		return getConstNumber(offset + 6, $qn_insp_val);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(MCNumber value) {
		setConstNumber(offset + 6, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(int value) {
		setConstNumber(offset + 6, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(long value) {
		setConstNumber(offset + 6, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(float value) {
		setConstNumber(offset + 6, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(double value) {
		setConstNumber(offset + 6, $qn_insp_val, value);
	}


	/**
	 * Update quantitative inspection value 定量検査値更新.<p>
	 *
	 */
	public boolean qn_insp_val_upd_flg() {
		return getConstBoolean(offset + 7, $qn_insp_val_upd_flg);
	}

	/**
	 * Update quantitative inspection value 定量検査値更新.<p>
	 *
	 */
	public void qn_insp_val_upd_flg(boolean value) {
		setConstBoolean(offset + 7, $qn_insp_val_upd_flg, value);
	}


	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public String ql_insp_val() {
		return getConstString(offset + 8, $ql_insp_val);
	}

	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public void ql_insp_val(String value) {
		setConstString(offset + 8, $ql_insp_val, value);
	}


	/**
	 * Update qualitative inspection value 定性検査値更新.<p>
	 *
	 */
	public boolean ql_insp_val_upd_flg() {
		return getConstBoolean(offset + 9, $ql_insp_val_upd_flg);
	}

	/**
	 * Update qualitative inspection value 定性検査値更新.<p>
	 *
	 */
	public void ql_insp_val_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $ql_insp_val_upd_flg, value);
	}


	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 10, $st_tm);
	}

	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 10, $st_tm, value);
	}


	/**
	 * Update inspection start time 検査開始日時更新.<p>
	 *
	 */
	public boolean st_tm_upd_flg() {
		return getConstBoolean(offset + 11, $st_tm_upd_flg);
	}

	/**
	 * Update inspection start time 検査開始日時更新.<p>
	 *
	 */
	public void st_tm_upd_flg(boolean value) {
		setConstBoolean(offset + 11, $st_tm_upd_flg, value);
	}


	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 12, $end_tm);
	}

	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 12, $end_tm, value);
	}


	/**
	 * Update inspection end time 検査終了日時更新.<p>
	 *
	 */
	public boolean end_tm_upd_flg() {
		return getConstBoolean(offset + 13, $end_tm_upd_flg);
	}

	/**
	 * Update inspection end time 検査終了日時更新.<p>
	 *
	 */
	public void end_tm_upd_flg(boolean value) {
		setConstBoolean(offset + 13, $end_tm_upd_flg, value);
	}


	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 14, $usr_cd);
	}

	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 14, $usr_cd, value);
	}


	/**
	 * Update inspection PIC cd. 検査者ＣＤ更新.<p>
	 *
	 */
	public boolean usr_cd_upd_flg() {
		return getConstBoolean(offset + 15, $usr_cd_upd_flg);
	}

	/**
	 * Update inspection PIC cd. 検査者ＣＤ更新.<p>
	 *
	 */
	public void usr_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 15, $usr_cd_upd_flg, value);
	}


	/**
	 * Dept. cd. of inspection PIC 検査者部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 16, $dpt_cd);
	}

	/**
	 * Dept. cd. of inspection PIC 検査者部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 16, $dpt_cd, value);
	}


	/**
	 * Update dept. cd. of inspection PIC 検査者部門ＣＤ更新.<p>
	 *
	 */
	public boolean dpt_cd_upd_flg() {
		return getConstBoolean(offset + 17, $dpt_cd_upd_flg);
	}

	/**
	 * Update dept. cd. of inspection PIC 検査者部門ＣＤ更新.<p>
	 *
	 */
	public void dpt_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 17, $dpt_cd_upd_flg, value);
	}


	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public String std_insp_rslt_typ() {
		return getConstString(offset + 18, $std_insp_rslt_typ);
	}

	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public void std_insp_rslt_typ(String value) {
		setConstString(offset + 18, $std_insp_rslt_typ, value);
	}


	/**
	 * Update inspection result type 判定結果区分更新.<p>
	 *
	 */
	public boolean std_insp_rslt_typ_upd_flg() {
		return getConstBoolean(offset + 19, $std_insp_rslt_typ_upd_flg);
	}

	/**
	 * Update inspection result type 判定結果区分更新.<p>
	 *
	 */
	public void std_insp_rslt_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 19, $std_insp_rslt_typ_upd_flg, value);
	}


	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 20, $act_intr_rmrks);
	}

	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 20, $act_intr_rmrks, value);
	}


	/**
	 * Update specific inspection result internal remarks 規格検査実績内部備考更新.<p>
	 *
	 */
	public boolean act_intr_rmrks_upd_flg() {
		return getConstBoolean(offset + 21, $act_intr_rmrks_upd_flg);
	}

	/**
	 * Update specific inspection result internal remarks 規格検査実績内部備考更新.<p>
	 *
	 */
	public void act_intr_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 21, $act_intr_rmrks_upd_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 22, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 22, $sub_char1, value);
	}


	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return getConstBoolean(offset + 23, $sub_char1_upd_flg);
	}

	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		setConstBoolean(offset + 23, $sub_char1_upd_flg, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 24, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 24, $sub_char2, value);
	}


	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return getConstBoolean(offset + 25, $sub_char2_upd_flg);
	}

	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		setConstBoolean(offset + 25, $sub_char2_upd_flg, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 26, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 26, $sub_char3, value);
	}


	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return getConstBoolean(offset + 27, $sub_char3_upd_flg);
	}

	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		setConstBoolean(offset + 27, $sub_char3_upd_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($qn_insp_val_upd_flg.equalsIgnoreCase(name)) {
			return qn_insp_val_upd_flg();
		}
		if ($ql_insp_val_upd_flg.equalsIgnoreCase(name)) {
			return ql_insp_val_upd_flg();
		}
		if ($st_tm_upd_flg.equalsIgnoreCase(name)) {
			return st_tm_upd_flg();
		}
		if ($end_tm_upd_flg.equalsIgnoreCase(name)) {
			return end_tm_upd_flg();
		}
		if ($usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return usr_cd_upd_flg();
		}
		if ($dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return dpt_cd_upd_flg();
		}
		if ($std_insp_rslt_typ_upd_flg.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ_upd_flg();
		}
		if ($act_intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return act_intr_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($qn_insp_val_upd_flg.equalsIgnoreCase(name)) {
			return qn_insp_val_upd_flg();
		}
		if ($ql_insp_val_upd_flg.equalsIgnoreCase(name)) {
			return ql_insp_val_upd_flg();
		}
		if ($st_tm_upd_flg.equalsIgnoreCase(name)) {
			return st_tm_upd_flg();
		}
		if ($end_tm_upd_flg.equalsIgnoreCase(name)) {
			return end_tm_upd_flg();
		}
		if ($usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return usr_cd_upd_flg();
		}
		if ($dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return dpt_cd_upd_flg();
		}
		if ($std_insp_rslt_typ_upd_flg.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ_upd_flg();
		}
		if ($act_intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return act_intr_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
			return;
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($qn_insp_val_upd_flg.equalsIgnoreCase(name)) {
			qn_insp_val_upd_flg(value);
			return;
		}
		if ($ql_insp_val_upd_flg.equalsIgnoreCase(name)) {
			ql_insp_val_upd_flg(value);
			return;
		}
		if ($st_tm_upd_flg.equalsIgnoreCase(name)) {
			st_tm_upd_flg(value);
			return;
		}
		if ($end_tm_upd_flg.equalsIgnoreCase(name)) {
			end_tm_upd_flg(value);
			return;
		}
		if ($usr_cd_upd_flg.equalsIgnoreCase(name)) {
			usr_cd_upd_flg(value);
			return;
		}
		if ($dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			dpt_cd_upd_flg(value);
			return;
		}
		if ($std_insp_rslt_typ_upd_flg.equalsIgnoreCase(name)) {
			std_insp_rslt_typ_upd_flg(value);
			return;
		}
		if ($act_intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			act_intr_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
			return;
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($qn_insp_val_upd_flg.equalsIgnoreCase(name)) {
			qn_insp_val_upd_flg(value);
			return;
		}
		if ($ql_insp_val_upd_flg.equalsIgnoreCase(name)) {
			ql_insp_val_upd_flg(value);
			return;
		}
		if ($st_tm_upd_flg.equalsIgnoreCase(name)) {
			st_tm_upd_flg(value);
			return;
		}
		if ($end_tm_upd_flg.equalsIgnoreCase(name)) {
			end_tm_upd_flg(value);
			return;
		}
		if ($usr_cd_upd_flg.equalsIgnoreCase(name)) {
			usr_cd_upd_flg(value);
			return;
		}
		if ($dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			dpt_cd_upd_flg(value);
			return;
		}
		if ($std_insp_rslt_typ_upd_flg.equalsIgnoreCase(name)) {
			std_insp_rslt_typ_upd_flg(value);
			return;
		}
		if ($act_intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			act_intr_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

