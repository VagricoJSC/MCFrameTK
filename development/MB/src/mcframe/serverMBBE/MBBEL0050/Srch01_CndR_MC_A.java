package mcframe.serverMBBE.MBBEL0050;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Executing 実行中.<p>
	 *
	 */
	public static final String $running_flg = "running_flg";
	/**
	 * End 終了.<p>
	 *
	 */
	public static final String $success_flg = "success_flg";
	/**
	 * Downloaded ダウンロード済み.<p>
	 *
	 */
	public static final String $download_flg = "download_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $error_flg = "error_flg";
	/**
	 * Excel Excel.<p>
	 *
	 */
	public static final String $excel_flg = "excel_flg";
	/**
	 * CSV CSV.<p>
	 *
	 */
	public static final String $csv_flg = "csv_flg";
	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public static final String $report_flg = "report_flg";
	/**
	 * Display screen 画面表示.<p>
	 *
	 */
	public static final String $screen_flg = "screen_flg";
	/**
	 * Process start date and time FROM 処理開始日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $proc_st_tm_fr = "proc_st_tm_fr";
	/**
	 * Process start date and time TO 処理開始日時ＴＯ.<p>
	 *
	 */
	public static final String $proc_st_tm_to = "proc_st_tm_to";
	/**
	 * Process end date FROM 処理終了日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $proc_end_tm_fr = "proc_end_tm_fr";
	/**
	 * Process end date TO 処理終了日時ＴＯ.<p>
	 *
	 */
	public static final String $proc_end_tm_to = "proc_end_tm_to";
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public static final String $biz_dat_nm = "biz_dat_nm";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $biz_dat_rmrks1 = "biz_dat_rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $biz_dat_rmrks2 = "biz_dat_rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $biz_dat_rmrks3 = "biz_dat_rmrks3";
	/**
	 * Download date and time FROM ダウンロード日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dl_tm_fr = "dl_tm_fr";
	/**
	 * Download date and time TO ダウンロード日時ＴＯ.<p>
	 *
	 */
	public static final String $dl_tm_to = "dl_tm_to";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $dl_file_nm = "dl_file_nm";
	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public static final String $file_size_fr = "file_size_fr";
	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public static final String $file_size_to = "file_size_to";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public static final String $biz_dat_dl_cond = "biz_dat_dl_cond";


	public static final MCMeta running_flg_META = createCommonMeta($running_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta success_flg_META = createCommonMeta($success_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta download_flg_META = createCommonMeta($download_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta error_flg_META = createCommonMeta($error_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_flg_META = createCommonMeta($excel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta csv_flg_META = createCommonMeta($csv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta report_flg_META = createCommonMeta($report_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta screen_flg_META = createCommonMeta($screen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_st_tm_fr_META = createCommonMeta($proc_st_tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta proc_st_tm_to_META = createCommonMeta($proc_st_tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta proc_end_tm_fr_META = createCommonMeta($proc_end_tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta proc_end_tm_to_META = createCommonMeta($proc_end_tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_nm_META = createCommonMeta($biz_dat_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_NM);
	public static final MCMeta biz_dat_rmrks1_META = createCommonMeta($biz_dat_rmrks1, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks2_META = createCommonMeta($biz_dat_rmrks2, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks3_META = createCommonMeta($biz_dat_rmrks3, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta dl_tm_fr_META = createCommonMeta($dl_tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dl_tm_to_META = createCommonMeta($dl_tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dl_file_nm_META = createCommonMeta($dl_file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta file_size_fr_META = createCommonMeta($file_size_fr, mcframe.commonMA.meta.MA_META.FILE_SIZE);
	public static final MCMeta file_size_to_META = createCommonMeta($file_size_to, mcframe.commonMA.meta.MA_META.FILE_SIZE);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta biz_dat_dl_cond_META = createCommonMeta($biz_dat_dl_cond, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_COND);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			running_flg_META,
			success_flg_META,
			download_flg_META,
			error_flg_META,
			excel_flg_META,
			csv_flg_META,
			report_flg_META,
			screen_flg_META,
			proc_st_tm_fr_META,
			proc_st_tm_to_META,
			proc_end_tm_fr_META,
			proc_end_tm_to_META,
			biz_dat_id_META,
			biz_dat_nm_META,
			biz_dat_rmrks1_META,
			biz_dat_rmrks2_META,
			biz_dat_rmrks3_META,
			dl_tm_fr_META,
			dl_tm_to_META,
			dl_file_nm_META,
			file_size_fr_META,
			file_size_to_META,
			usr_cd_META,
			usr_nm_META,
			biz_dat_dl_cond_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Executing 実行中.<p>
	 *
	 */
	public boolean running_flg() {
		return getConstBoolean(offset + 0, $running_flg);
	}

	/**
	 * Executing 実行中.<p>
	 *
	 */
	public void running_flg(boolean value) {
		setConstBoolean(offset + 0, $running_flg, value);
	}


	/**
	 * End 終了.<p>
	 *
	 */
	public boolean success_flg() {
		return getConstBoolean(offset + 1, $success_flg);
	}

	/**
	 * End 終了.<p>
	 *
	 */
	public void success_flg(boolean value) {
		setConstBoolean(offset + 1, $success_flg, value);
	}


	/**
	 * Downloaded ダウンロード済み.<p>
	 *
	 */
	public boolean download_flg() {
		return getConstBoolean(offset + 2, $download_flg);
	}

	/**
	 * Downloaded ダウンロード済み.<p>
	 *
	 */
	public void download_flg(boolean value) {
		setConstBoolean(offset + 2, $download_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean error_flg() {
		return getConstBoolean(offset + 3, $error_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void error_flg(boolean value) {
		setConstBoolean(offset + 3, $error_flg, value);
	}


	/**
	 * Excel Excel.<p>
	 *
	 */
	public boolean excel_flg() {
		return getConstBoolean(offset + 4, $excel_flg);
	}

	/**
	 * Excel Excel.<p>
	 *
	 */
	public void excel_flg(boolean value) {
		setConstBoolean(offset + 4, $excel_flg, value);
	}


	/**
	 * CSV CSV.<p>
	 *
	 */
	public boolean csv_flg() {
		return getConstBoolean(offset + 5, $csv_flg);
	}

	/**
	 * CSV CSV.<p>
	 *
	 */
	public void csv_flg(boolean value) {
		setConstBoolean(offset + 5, $csv_flg, value);
	}


	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public boolean report_flg() {
		return getConstBoolean(offset + 6, $report_flg);
	}

	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public void report_flg(boolean value) {
		setConstBoolean(offset + 6, $report_flg, value);
	}


	/**
	 * Display screen 画面表示.<p>
	 *
	 */
	public boolean screen_flg() {
		return getConstBoolean(offset + 7, $screen_flg);
	}

	/**
	 * Display screen 画面表示.<p>
	 *
	 */
	public void screen_flg(boolean value) {
		setConstBoolean(offset + 7, $screen_flg, value);
	}


	/**
	 * Process start date and time FROM 処理開始日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate proc_st_tm_fr() {
		return getConstDate(offset + 8, $proc_st_tm_fr);
	}

	/**
	 * Process start date and time FROM 処理開始日時ＦＲＯＭ.<p>
	 *
	 */
	public void proc_st_tm_fr(MCDate value) {
		setConstDate(offset + 8, $proc_st_tm_fr, value);
	}


	/**
	 * Process start date and time TO 処理開始日時ＴＯ.<p>
	 *
	 */
	public MCDate proc_st_tm_to() {
		return getConstDate(offset + 9, $proc_st_tm_to);
	}

	/**
	 * Process start date and time TO 処理開始日時ＴＯ.<p>
	 *
	 */
	public void proc_st_tm_to(MCDate value) {
		setConstDate(offset + 9, $proc_st_tm_to, value);
	}


	/**
	 * Process end date FROM 処理終了日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate proc_end_tm_fr() {
		return getConstDate(offset + 10, $proc_end_tm_fr);
	}

	/**
	 * Process end date FROM 処理終了日時ＦＲＯＭ.<p>
	 *
	 */
	public void proc_end_tm_fr(MCDate value) {
		setConstDate(offset + 10, $proc_end_tm_fr, value);
	}


	/**
	 * Process end date TO 処理終了日時ＴＯ.<p>
	 *
	 */
	public MCDate proc_end_tm_to() {
		return getConstDate(offset + 11, $proc_end_tm_to);
	}

	/**
	 * Process end date TO 処理終了日時ＴＯ.<p>
	 *
	 */
	public void proc_end_tm_to(MCDate value) {
		setConstDate(offset + 11, $proc_end_tm_to, value);
	}


	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 12, $biz_dat_id);
	}

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 12, $biz_dat_id, value);
	}


	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public String biz_dat_nm() {
		return getConstString(offset + 13, $biz_dat_nm);
	}

	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public void biz_dat_nm(String value) {
		setConstString(offset + 13, $biz_dat_nm, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String biz_dat_rmrks1() {
		return getConstString(offset + 14, $biz_dat_rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void biz_dat_rmrks1(String value) {
		setConstString(offset + 14, $biz_dat_rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String biz_dat_rmrks2() {
		return getConstString(offset + 15, $biz_dat_rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void biz_dat_rmrks2(String value) {
		setConstString(offset + 15, $biz_dat_rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String biz_dat_rmrks3() {
		return getConstString(offset + 16, $biz_dat_rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void biz_dat_rmrks3(String value) {
		setConstString(offset + 16, $biz_dat_rmrks3, value);
	}


	/**
	 * Download date and time FROM ダウンロード日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dl_tm_fr() {
		return getConstDate(offset + 17, $dl_tm_fr);
	}

	/**
	 * Download date and time FROM ダウンロード日時ＦＲＯＭ.<p>
	 *
	 */
	public void dl_tm_fr(MCDate value) {
		setConstDate(offset + 17, $dl_tm_fr, value);
	}


	/**
	 * Download date and time TO ダウンロード日時ＴＯ.<p>
	 *
	 */
	public MCDate dl_tm_to() {
		return getConstDate(offset + 18, $dl_tm_to);
	}

	/**
	 * Download date and time TO ダウンロード日時ＴＯ.<p>
	 *
	 */
	public void dl_tm_to(MCDate value) {
		setConstDate(offset + 18, $dl_tm_to, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String dl_file_nm() {
		return getConstString(offset + 19, $dl_file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void dl_file_nm(String value) {
		setConstString(offset + 19, $dl_file_nm, value);
	}


	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber file_size_fr() {
		return getConstNumber(offset + 20, $file_size_fr);
	}

	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public void file_size_fr(MCNumber value) {
		setConstNumber(offset + 20, $file_size_fr, value);
	}

	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public void file_size_fr(int value) {
		setConstNumber(offset + 20, $file_size_fr, value);
	}

	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public void file_size_fr(long value) {
		setConstNumber(offset + 20, $file_size_fr, value);
	}

	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public void file_size_fr(float value) {
		setConstNumber(offset + 20, $file_size_fr, value);
	}

	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public void file_size_fr(double value) {
		setConstNumber(offset + 20, $file_size_fr, value);
	}


	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public MCNumber file_size_to() {
		return getConstNumber(offset + 21, $file_size_to);
	}

	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public void file_size_to(MCNumber value) {
		setConstNumber(offset + 21, $file_size_to, value);
	}

	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public void file_size_to(int value) {
		setConstNumber(offset + 21, $file_size_to, value);
	}

	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public void file_size_to(long value) {
		setConstNumber(offset + 21, $file_size_to, value);
	}

	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public void file_size_to(float value) {
		setConstNumber(offset + 21, $file_size_to, value);
	}

	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public void file_size_to(double value) {
		setConstNumber(offset + 21, $file_size_to, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 22, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 22, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 23, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 23, $usr_nm, value);
	}


	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public String biz_dat_dl_cond() {
		return getConstString(offset + 24, $biz_dat_dl_cond);
	}

	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public void biz_dat_dl_cond(String value) {
		setConstString(offset + 24, $biz_dat_dl_cond, value);
	}


	public String getString(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			return dl_file_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			return biz_dat_dl_cond();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			return file_size_fr();
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			return file_size_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($proc_st_tm_fr.equalsIgnoreCase(name)) {
			return proc_st_tm_fr();
		}
		if ($proc_st_tm_to.equalsIgnoreCase(name)) {
			return proc_st_tm_to();
		}
		if ($proc_end_tm_fr.equalsIgnoreCase(name)) {
			return proc_end_tm_fr();
		}
		if ($proc_end_tm_to.equalsIgnoreCase(name)) {
			return proc_end_tm_to();
		}
		if ($dl_tm_fr.equalsIgnoreCase(name)) {
			return dl_tm_fr();
		}
		if ($dl_tm_to.equalsIgnoreCase(name)) {
			return dl_tm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($running_flg.equalsIgnoreCase(name)) {
			return running_flg();
		}
		if ($success_flg.equalsIgnoreCase(name)) {
			return success_flg();
		}
		if ($download_flg.equalsIgnoreCase(name)) {
			return download_flg();
		}
		if ($error_flg.equalsIgnoreCase(name)) {
			return error_flg();
		}
		if ($excel_flg.equalsIgnoreCase(name)) {
			return excel_flg();
		}
		if ($csv_flg.equalsIgnoreCase(name)) {
			return csv_flg();
		}
		if ($report_flg.equalsIgnoreCase(name)) {
			return report_flg();
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			return screen_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			return dl_file_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			return biz_dat_dl_cond();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			return file_size_fr();
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			return file_size_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($proc_st_tm_fr.equalsIgnoreCase(name)) {
			return proc_st_tm_fr();
		}
		if ($proc_st_tm_to.equalsIgnoreCase(name)) {
			return proc_st_tm_to();
		}
		if ($proc_end_tm_fr.equalsIgnoreCase(name)) {
			return proc_end_tm_fr();
		}
		if ($proc_end_tm_to.equalsIgnoreCase(name)) {
			return proc_end_tm_to();
		}
		if ($dl_tm_fr.equalsIgnoreCase(name)) {
			return dl_tm_fr();
		}
		if ($dl_tm_to.equalsIgnoreCase(name)) {
			return dl_tm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($running_flg.equalsIgnoreCase(name)) {
			return running_flg();
		}
		if ($success_flg.equalsIgnoreCase(name)) {
			return success_flg();
		}
		if ($download_flg.equalsIgnoreCase(name)) {
			return download_flg();
		}
		if ($error_flg.equalsIgnoreCase(name)) {
			return error_flg();
		}
		if ($excel_flg.equalsIgnoreCase(name)) {
			return excel_flg();
		}
		if ($csv_flg.equalsIgnoreCase(name)) {
			return csv_flg();
		}
		if ($report_flg.equalsIgnoreCase(name)) {
			return report_flg();
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			return screen_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			dl_file_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			biz_dat_dl_cond(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($proc_st_tm_fr.equalsIgnoreCase(name)) {
			proc_st_tm_fr(value);
			return;
		}
		if ($proc_st_tm_to.equalsIgnoreCase(name)) {
			proc_st_tm_to(value);
			return;
		}
		if ($proc_end_tm_fr.equalsIgnoreCase(name)) {
			proc_end_tm_fr(value);
			return;
		}
		if ($proc_end_tm_to.equalsIgnoreCase(name)) {
			proc_end_tm_to(value);
			return;
		}
		if ($dl_tm_fr.equalsIgnoreCase(name)) {
			dl_tm_fr(value);
			return;
		}
		if ($dl_tm_to.equalsIgnoreCase(name)) {
			dl_tm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($running_flg.equalsIgnoreCase(name)) {
			running_flg(value);
			return;
		}
		if ($success_flg.equalsIgnoreCase(name)) {
			success_flg(value);
			return;
		}
		if ($download_flg.equalsIgnoreCase(name)) {
			download_flg(value);
			return;
		}
		if ($error_flg.equalsIgnoreCase(name)) {
			error_flg(value);
			return;
		}
		if ($excel_flg.equalsIgnoreCase(name)) {
			excel_flg(value);
			return;
		}
		if ($csv_flg.equalsIgnoreCase(name)) {
			csv_flg(value);
			return;
		}
		if ($report_flg.equalsIgnoreCase(name)) {
			report_flg(value);
			return;
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			screen_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			dl_file_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			biz_dat_dl_cond(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($file_size_fr.equalsIgnoreCase(name)) {
			file_size_fr(value);
			return;
		}
		if ($file_size_to.equalsIgnoreCase(name)) {
			file_size_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($proc_st_tm_fr.equalsIgnoreCase(name)) {
			proc_st_tm_fr(value);
			return;
		}
		if ($proc_st_tm_to.equalsIgnoreCase(name)) {
			proc_st_tm_to(value);
			return;
		}
		if ($proc_end_tm_fr.equalsIgnoreCase(name)) {
			proc_end_tm_fr(value);
			return;
		}
		if ($proc_end_tm_to.equalsIgnoreCase(name)) {
			proc_end_tm_to(value);
			return;
		}
		if ($dl_tm_fr.equalsIgnoreCase(name)) {
			dl_tm_fr(value);
			return;
		}
		if ($dl_tm_to.equalsIgnoreCase(name)) {
			dl_tm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($running_flg.equalsIgnoreCase(name)) {
			running_flg(value);
			return;
		}
		if ($success_flg.equalsIgnoreCase(name)) {
			success_flg(value);
			return;
		}
		if ($download_flg.equalsIgnoreCase(name)) {
			download_flg(value);
			return;
		}
		if ($error_flg.equalsIgnoreCase(name)) {
			error_flg(value);
			return;
		}
		if ($excel_flg.equalsIgnoreCase(name)) {
			excel_flg(value);
			return;
		}
		if ($csv_flg.equalsIgnoreCase(name)) {
			csv_flg(value);
			return;
		}
		if ($report_flg.equalsIgnoreCase(name)) {
			report_flg(value);
			return;
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			screen_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

