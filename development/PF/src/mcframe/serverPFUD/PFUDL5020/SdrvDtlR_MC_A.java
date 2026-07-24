package mcframe.serverPFUD.PFUDL5020;

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
 * ブロック"SdrvDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SdrvDtlR_MC_A extends MCConstRow {

	/**
	 * Import IF 受信ＩＦ.<p>
	 *
	 */
	public static final String $sdrvIf = "sdrvIf";
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public static final String $ifFile = "ifFile";
	/**
	 * Status file suffix ステータスファイル接尾辞.<p>
	 *
	 */
	public static final String $sts_fsuffix = "sts_fsuffix";
	/**
	 * Batch activation バッチ起動.<p>
	 *
	 */
	public static final String $batch_flg = "batch_flg";
	/**
	 * Not for intercompany transactions 会社間取引対象外.<p>
	 *
	 */
	public static final String $not_coopr_flg = "not_coopr_flg";
	/**
	 * IF data entered ＩＦデータ登録済.<p>
	 *
	 */
	public static final String $if_ins_flg = "if_ins_flg";
	public static final String $co_cd = "co_cd";

	public static final String $if_proc_typ = $sdrvIf + ".if_proc_typ";
	public static final String $data_no = $sdrvIf + ".data_no";
	public static final String $ext_sys_cd = $sdrvIf + ".ext_sys_cd";
	public static final String $sdrv_sts_typ = $sdrvIf + ".sdrv_sts_typ";
	public static final String $file_id = $ifFile + ".file_id";
	public static final String $file_path = $ifFile + ".file_path";
	public static final String $file_nm = $ifFile + ".file_nm";

	public static final MCMeta sdrvIf_META = createInnerRowMeta($sdrvIf, mcframe.serverPF.dbc.PFT_SDRV_IF_R.class);
	public static final MCMeta ifFile_META = createInnerRowMeta($ifFile, mcframe.serverPF.dbc.PFT_IF_FILE_R.class);
	public static final MCMeta sts_fsuffix_META = createCommonMeta($sts_fsuffix, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta batch_flg_META = createCommonMeta($batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_coopr_flg_META = createCommonMeta($not_coopr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_ins_flg_META = createCommonMeta($if_ins_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);

	protected static final ConstMetaList<SdrvDtlR> constMetas = new ConstMetaList<SdrvDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdrvIf_META,
			ifFile_META,
			sts_fsuffix_META,
			batch_flg_META,
			not_coopr_flg_META,
			if_ins_flg_META,
			co_cd_META
		},
		new String[][]{
			{
				"if_proc_typ",
				"data_no",
				"ext_sys_cd",
				"sdrv_sts_typ",
				"file_id",
				"file_path",
				"file_nm"
			},
			{
				$if_proc_typ,
				$data_no,
				$ext_sys_cd,
				$sdrv_sts_typ,
				$file_id,
				$file_path,
				$file_nm
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
	protected SdrvDtlR_MC_A(ConstMetaList<? extends SdrvDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SdrvDtlR clone() {
		return (SdrvDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SdrvDtlR createInstance() {
		return (SdrvDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SdrvDtlR getValues(String... names) {
		return (SdrvDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Import IF 受信ＩＦ.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_SDRV_IF_R sdrvIf(){
		return (mcframe.serverPF.dbc.PFT_SDRV_IF_R) getConstInnerRow(offset + 0, $sdrvIf);
	}
	
	/**
	 * Import IF 受信ＩＦ.<p>
	 *
	 */
	public void sdrvIf(mcframe.serverPF.dbc.PFT_SDRV_IF_R row){
		setConstInnerRow(offset + 0, $sdrvIf, row);
	}


	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_IF_FILE_R ifFile(){
		return (mcframe.serverPF.dbc.PFT_IF_FILE_R) getConstInnerRow(offset + 1, $ifFile);
	}
	
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public void ifFile(mcframe.serverPF.dbc.PFT_IF_FILE_R row){
		setConstInnerRow(offset + 1, $ifFile, row);
	}


	/**
	 * Status file suffix ステータスファイル接尾辞.<p>
	 *
	 */
	public String sts_fsuffix() {
		return getConstString(offset + 2, $sts_fsuffix);
	}

	/**
	 * Status file suffix ステータスファイル接尾辞.<p>
	 *
	 */
	public void sts_fsuffix(String value) {
		setConstString(offset + 2, $sts_fsuffix, value);
	}


	/**
	 * Batch activation バッチ起動.<p>
	 *
	 */
	public boolean batch_flg() {
		return getConstBoolean(offset + 3, $batch_flg);
	}

	/**
	 * Batch activation バッチ起動.<p>
	 *
	 */
	public void batch_flg(boolean value) {
		setConstBoolean(offset + 3, $batch_flg, value);
	}


	/**
	 * Not for intercompany transactions 会社間取引対象外.<p>
	 *
	 */
	public boolean not_coopr_flg() {
		return getConstBoolean(offset + 4, $not_coopr_flg);
	}

	/**
	 * Not for intercompany transactions 会社間取引対象外.<p>
	 *
	 */
	public void not_coopr_flg(boolean value) {
		setConstBoolean(offset + 4, $not_coopr_flg, value);
	}


	/**
	 * IF data entered ＩＦデータ登録済.<p>
	 *
	 */
	public boolean if_ins_flg() {
		return getConstBoolean(offset + 5, $if_ins_flg);
	}

	/**
	 * IF data entered ＩＦデータ登録済.<p>
	 *
	 */
	public void if_ins_flg(boolean value) {
		setConstBoolean(offset + 5, $if_ins_flg, value);
	}


	public String co_cd() {
		return getConstString(offset + 6, $co_cd);
	}

	public void co_cd(String value) {
		setConstString(offset + 6, $co_cd, value);
	}


	public String getString(String name) {
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			return sts_fsuffix();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($batch_flg.equalsIgnoreCase(name)) {
			return batch_flg();
		}
		if ($not_coopr_flg.equalsIgnoreCase(name)) {
			return not_coopr_flg();
		}
		if ($if_ins_flg.equalsIgnoreCase(name)) {
			return if_ins_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			return sts_fsuffix();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($batch_flg.equalsIgnoreCase(name)) {
			return batch_flg();
		}
		if ($not_coopr_flg.equalsIgnoreCase(name)) {
			return not_coopr_flg();
		}
		if ($if_ins_flg.equalsIgnoreCase(name)) {
			return if_ins_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			sts_fsuffix(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($batch_flg.equalsIgnoreCase(name)) {
			batch_flg(value);
			return;
		}
		if ($not_coopr_flg.equalsIgnoreCase(name)) {
			not_coopr_flg(value);
			return;
		}
		if ($if_ins_flg.equalsIgnoreCase(name)) {
			if_ins_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			sts_fsuffix(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($batch_flg.equalsIgnoreCase(name)) {
			batch_flg(value);
			return;
		}
		if ($not_coopr_flg.equalsIgnoreCase(name)) {
			not_coopr_flg(value);
			return;
		}
		if ($if_ins_flg.equalsIgnoreCase(name)) {
			if_ins_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sdrvIf.equalsIgnoreCase(name)) {
			return sdrvIf();
		}
		if ($ifFile.equalsIgnoreCase(name)) {
			return ifFile();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sdrvIf.equalsIgnoreCase(name)) {
			sdrvIf(
				((MCContainerMeta) sdrvIf_META).castInnerRow(mcframe.serverPF.dbc.PFT_SDRV_IF_R.class, value)
			);
			return;
		}
		if ($ifFile.equalsIgnoreCase(name)) {
			ifFile(
				((MCContainerMeta) ifFile_META).castInnerRow(mcframe.serverPF.dbc.PFT_IF_FILE_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return sdrvIf().if_proc_typ();
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		sdrvIf().if_proc_typ(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return sdrvIf().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		sdrvIf().data_no(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return sdrvIf().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		sdrvIf().ext_sys_cd(value);
	}

	/**
	 * Exporting and importing status type 送受信状況区分.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return sdrvIf().sdrv_sts_typ();
	}

	/**
	 * Exporting and importing status type 送受信状況区分.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		sdrvIf().sdrv_sts_typ(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public MCNumber file_id() {
		return ifFile().file_id();
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(MCNumber value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(int value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(long value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(float value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(double value) {
		ifFile().file_id(value);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return ifFile().file_path();
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		ifFile().file_path(value);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return ifFile().file_nm();
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		ifFile().file_nm(value);
	}

}

