package mcframe.serverMBBE.MBBEL0040;

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
 * ブロック"Prnt01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt01_CndR_MC_A extends MCConstRow {

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public static final String $sql_src = "sql_src";
	/**
	 * Bind バインド.<p>
	 *
	 */
	public static final String $bind = "bind";
	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public static final String $biz_dat_file_typ = "biz_dat_file_typ";
	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public static final String $form_file_nm = "form_file_nm";
	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public static final String $cartridge = "cartridge";
	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public static final String $dwnld_flg = "dwnld_flg";


	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta sql_src_META = createCommonMeta($sql_src, mcframe.commonMA.meta.MA_META.SQL_SRC);
	public static final MCMeta bind_META = createCommonMeta($bind, mcframe.commonMA.meta.MA_META.SQL_BIND);
	public static final MCMeta biz_dat_file_typ_META = createCommonMeta($biz_dat_file_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_FILE_TYP);
	public static final MCMeta form_file_nm_META = createCommonMeta($form_file_nm, mcframe.commonMA.meta.MA_META.PRINT_FILE_NAME);
	public static final MCMeta cartridge_META = createCommonMeta($cartridge, mcframe.commonMA.meta.MA_META.CARTRIDGE);
	public static final MCMeta dwnld_flg_META = createCommonMeta($dwnld_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Prnt01_CndR> constMetas = new ConstMetaList<Prnt01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_id_META,
			sql_src_META,
			bind_META,
			biz_dat_file_typ_META,
			form_file_nm_META,
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
	protected Prnt01_CndR_MC_A(ConstMetaList<? extends Prnt01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_CndR clone() {
		return (Prnt01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_CndR createInstance() {
		return (Prnt01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_CndR getValues(String... names) {
		return (Prnt01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public String sql_src() {
		return getConstString(offset + 1, $sql_src);
	}

	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public void sql_src(String value) {
		setConstString(offset + 1, $sql_src, value);
	}


	/**
	 * Bind バインド.<p>
	 *
	 */
	public String bind() {
		return getConstString(offset + 2, $bind);
	}

	/**
	 * Bind バインド.<p>
	 *
	 */
	public void bind(String value) {
		setConstString(offset + 2, $bind, value);
	}


	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public String biz_dat_file_typ() {
		return getConstString(offset + 3, $biz_dat_file_typ);
	}

	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public void biz_dat_file_typ(String value) {
		setConstString(offset + 3, $biz_dat_file_typ, value);
	}


	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public String form_file_nm() {
		return getConstString(offset + 4, $form_file_nm);
	}

	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public void form_file_nm(String value) {
		setConstString(offset + 4, $form_file_nm, value);
	}


	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public String cartridge() {
		return getConstString(offset + 5, $cartridge);
	}

	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public void cartridge(String value) {
		setConstString(offset + 5, $cartridge, value);
	}


	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public boolean dwnld_flg() {
		return getConstBoolean(offset + 6, $dwnld_flg);
	}

	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public void dwnld_flg(boolean value) {
		setConstBoolean(offset + 6, $dwnld_flg, value);
	}


	public String getString(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		if ($bind.equalsIgnoreCase(name)) {
			return bind();
		}
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		if ($bind.equalsIgnoreCase(name)) {
			return bind();
		}
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
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
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		if ($bind.equalsIgnoreCase(name)) {
			bind(value);
			return;
		}
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		if ($bind.equalsIgnoreCase(name)) {
			bind(value);
			return;
		}
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

