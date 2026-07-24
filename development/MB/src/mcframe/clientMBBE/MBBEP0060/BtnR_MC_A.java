package mcframe.clientMBBE.MBBEP0060;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Btn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BtnR_MC_A extends MCConstRow {

	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public static final String $biz_dat_file_typ = "biz_dat_file_typ";
	/**
	 * Target folder 出力先フォルダ.<p>
	 *
	 */
	public static final String $out_path = "out_path";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * File type ファイルタイプ.<p>
	 *
	 */
	public static final String $file_typ = "file_typ";
	/**
	 * Overwrite flg. 上書きフラグ.<p>
	 *
	 */
	public static final String $ow_flg = "ow_flg";


	public static final MCMeta biz_dat_file_typ_META = createCommonMeta($biz_dat_file_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_FILE_TYP);
	public static final MCMeta out_path_META = createStringMeta($out_path);
	public static final MCMeta file_nm_META = createStringMeta($file_nm);
	public static final MCMeta file_typ_META = createStringMeta($file_typ);
	public static final MCMeta ow_flg_META = createCommonMeta($ow_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BtnR> constMetas = new ConstMetaList<BtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_file_typ_META,
			out_path_META,
			file_nm_META,
			file_typ_META,
			ow_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected BtnR_MC_A(ConstMetaList<? extends BtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR clone() {
		return (BtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR createInstance() {
		return (BtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR getValues(String... names) {
		return (BtnR) super.getValues(names);
	}



	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public String biz_dat_file_typ() {
		return getConstString(offset + 0, $biz_dat_file_typ);
	}

	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public void biz_dat_file_typ(String value) {
		setConstString(offset + 0, $biz_dat_file_typ, value);
	}


	/**
	 * Target folder 出力先フォルダ.<p>
	 *
	 */
	public String out_path() {
		return getConstString(offset + 1, $out_path);
	}

	/**
	 * Target folder 出力先フォルダ.<p>
	 *
	 */
	public void out_path(String value) {
		setConstString(offset + 1, $out_path, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 2, $file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 2, $file_nm, value);
	}


	/**
	 * File type ファイルタイプ.<p>
	 *
	 */
	public String file_typ() {
		return getConstString(offset + 3, $file_typ);
	}

	/**
	 * File type ファイルタイプ.<p>
	 *
	 */
	public void file_typ(String value) {
		setConstString(offset + 3, $file_typ, value);
	}


	/**
	 * Overwrite flg. 上書きフラグ.<p>
	 *
	 */
	public boolean ow_flg() {
		return getConstBoolean(offset + 4, $ow_flg);
	}

	/**
	 * Overwrite flg. 上書きフラグ.<p>
	 *
	 */
	public void ow_flg(boolean value) {
		setConstBoolean(offset + 4, $ow_flg, value);
	}


	public String getString(String name) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($out_path.equalsIgnoreCase(name)) {
			return out_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($file_typ.equalsIgnoreCase(name)) {
			return file_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			return ow_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($out_path.equalsIgnoreCase(name)) {
			return out_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($file_typ.equalsIgnoreCase(name)) {
			return file_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			return ow_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($out_path.equalsIgnoreCase(name)) {
			out_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($file_typ.equalsIgnoreCase(name)) {
			file_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			ow_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($out_path.equalsIgnoreCase(name)) {
			out_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($file_typ.equalsIgnoreCase(name)) {
			file_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			ow_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

