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
 * ブロック"Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public static final String $biz_dat_dl_hst_no = "biz_dat_dl_hst_no";
	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public static final String $dl_file_path = "dl_file_path";


	public static final MCMeta biz_dat_dl_hst_no_META = createCommonMeta($biz_dat_dl_hst_no, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_HST_NO);
	public static final MCMeta dl_file_path_META = createCommonMeta($dl_file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);

	protected static final ConstMetaList<Upd01_DtlR> constMetas = new ConstMetaList<Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_dl_hst_no_META,
			dl_file_path_META
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
	protected Upd01_DtlR_MC_A(ConstMetaList<? extends Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR clone() {
		return (Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR createInstance() {
		return (Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR getValues(String... names) {
		return (Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public String biz_dat_dl_hst_no() {
		return getConstString(offset + 0, $biz_dat_dl_hst_no);
	}

	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public void biz_dat_dl_hst_no(String value) {
		setConstString(offset + 0, $biz_dat_dl_hst_no, value);
	}


	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public String dl_file_path() {
		return getConstString(offset + 1, $dl_file_path);
	}

	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public void dl_file_path(String value) {
		setConstString(offset + 1, $dl_file_path, value);
	}


	public String getString(String name) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			return biz_dat_dl_hst_no();
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			return dl_file_path();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			return biz_dat_dl_hst_no();
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			return dl_file_path();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			biz_dat_dl_hst_no(value);
			return;
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			dl_file_path(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			biz_dat_dl_hst_no(value);
			return;
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			dl_file_path(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

