package mcframe.serverPFBZ.PFBZL9050;

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
 * ブロック"Can01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Can01_DtlR_MC_A extends MCConstRow {

	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public static final String $sdrvIf = "sdrvIf";
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public static final String $ifFile = "ifFile";

	public static final String $if_proc_typ = $sdrvIf + ".if_proc_typ";
	public static final String $data_no = $sdrvIf + ".data_no";
	public static final String $file_id = $ifFile + ".file_id";

	public static final MCMeta sdrvIf_META = createInnerRowMeta($sdrvIf, mcframe.serverPF.dbc.PFT_SDRV_IF_R.class);
	public static final MCMeta ifFile_META = createInnerRowMeta($ifFile, mcframe.serverPF.dbc.PFT_IF_FILE_R.class);

	protected static final ConstMetaList<Can01_DtlR> constMetas = new ConstMetaList<Can01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdrvIf_META,
			ifFile_META
		},
		new String[][]{
			{
				"if_proc_typ",
				"data_no",
				"file_id"
			},
			{
				$if_proc_typ,
				$data_no,
				$file_id
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
	protected Can01_DtlR_MC_A(ConstMetaList<? extends Can01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Can01_DtlR clone() {
		return (Can01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Can01_DtlR createInstance() {
		return (Can01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Can01_DtlR getValues(String... names) {
		return (Can01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_SDRV_IF_R sdrvIf(){
		return (mcframe.serverPF.dbc.PFT_SDRV_IF_R) getConstInnerRow(offset + 0, $sdrvIf);
	}
	
	/**
	 * Export IF 送信ＩＦ.<p>
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

}

