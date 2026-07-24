package mcframe.clientMBBE.MBBEP0040;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

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
	 * File classification ファイル種類.<p>
	 *
	 */
	public static final String $biz_dat_file_typ = "biz_dat_file_typ";
	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public static final String $biz_dat_get_typ = "biz_dat_get_typ";
	public static final String $out_path = "out_path";
	public static final String $file_nm = "file_nm";
	public static final String $file_typ = "file_typ";
	public static final String $ow_flg = "ow_flg";
	public static final String $bind = "bind";
	public static final String $cartridge = "cartridge";
	public static final String $dwnld_flg = "dwnld_flg";


	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_nm_META = createCommonMeta($biz_dat_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_NM);
	public static final MCMeta biz_dat_file_typ_META = createCommonMeta($biz_dat_file_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_FILE_TYP);
	public static final MCMeta biz_dat_get_typ_META = createCommonMeta($biz_dat_get_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_GET_TYP);
	public static final MCMeta out_path_META = createStringMeta($out_path);
	public static final MCMeta file_nm_META = createStringMeta($file_nm);
	public static final MCMeta file_typ_META = createStringMeta($file_typ);
	public static final MCMeta ow_flg_META = createCommonMeta($ow_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bind_META = createCommonMeta($bind, mcframe.commonMA.meta.MA_META.SQL_BIND);
	public static final MCMeta cartridge_META = createCommonMeta($cartridge, mcframe.commonMA.meta.MA_META.CARTRIDGE);
	public static final MCMeta dwnld_flg_META = createCommonMeta($dwnld_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_id_META,
			biz_dat_nm_META,
			biz_dat_file_typ_META,
			biz_dat_get_typ_META,
			out_path_META,
			file_nm_META,
			file_typ_META,
			ow_flg_META,
			bind_META,
			cartridge_META,
			dwnld_flg_META
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 0, $biz_dat_id);
	}

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 0, $biz_dat_id, value);
	}


	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public String biz_dat_nm() {
		return getConstString(offset + 1, $biz_dat_nm);
	}

	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public void biz_dat_nm(String value) {
		setConstString(offset + 1, $biz_dat_nm, value);
	}


	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public String biz_dat_file_typ() {
		return getConstString(offset + 2, $biz_dat_file_typ);
	}

	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public void biz_dat_file_typ(String value) {
		setConstString(offset + 2, $biz_dat_file_typ, value);
	}


	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public String biz_dat_get_typ() {
		return getConstString(offset + 3, $biz_dat_get_typ);
	}

	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public void biz_dat_get_typ(String value) {
		setConstString(offset + 3, $biz_dat_get_typ, value);
	}


	public String out_path() {
		return getConstString(offset + 4, $out_path);
	}

	public void out_path(String value) {
		setConstString(offset + 4, $out_path, value);
	}


	public String file_nm() {
		return getConstString(offset + 5, $file_nm);
	}

	public void file_nm(String value) {
		setConstString(offset + 5, $file_nm, value);
	}


	public String file_typ() {
		return getConstString(offset + 6, $file_typ);
	}

	public void file_typ(String value) {
		setConstString(offset + 6, $file_typ, value);
	}


	public boolean ow_flg() {
		return getConstBoolean(offset + 7, $ow_flg);
	}

	public void ow_flg(boolean value) {
		setConstBoolean(offset + 7, $ow_flg, value);
	}


	public String bind() {
		return getConstString(offset + 8, $bind);
	}

	public void bind(String value) {
		setConstString(offset + 8, $bind, value);
	}


	public String cartridge() {
		return getConstString(offset + 9, $cartridge);
	}

	public void cartridge(String value) {
		setConstString(offset + 9, $cartridge, value);
	}


	public boolean dwnld_flg() {
		return getConstBoolean(offset + 10, $dwnld_flg);
	}

	public void dwnld_flg(boolean value) {
		setConstBoolean(offset + 10, $dwnld_flg, value);
	}


	public String getString(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			return biz_dat_get_typ();
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
		if ($bind.equalsIgnoreCase(name)) {
			return bind();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			return ow_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			return biz_dat_get_typ();
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
		if ($bind.equalsIgnoreCase(name)) {
			return bind();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			return ow_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			biz_dat_get_typ(value);
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
		if ($bind.equalsIgnoreCase(name)) {
			bind(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			ow_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			biz_dat_get_typ(value);
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
		if ($bind.equalsIgnoreCase(name)) {
			bind(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ow_flg.equalsIgnoreCase(name)) {
			ow_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

