package mcframe.serverMSBD.MSBDL0120;

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
 * ブロック"Upd02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd02_CtrlR_MC_A extends MCConstRow {

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_print_flg = "dlv_slip_print_flg";
	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_print_flg = "purc_ddlv_dlv_slip_print_flg";
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";


	public static final MCMeta dlv_slip_print_flg_META = createCommonMeta($dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_dlv_slip_print_flg_META = createCommonMeta($purc_ddlv_dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Upd02_CtrlR> constMetas = new ConstMetaList<Upd02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_slip_print_flg_META,
			purc_ddlv_dlv_slip_print_flg_META,
			indiv_prnt_flg_META
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
	protected Upd02_CtrlR_MC_A(ConstMetaList<? extends Upd02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_CtrlR clone() {
		return (Upd02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_CtrlR createInstance() {
		return (Upd02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_CtrlR getValues(String... names) {
		return (Upd02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_print_flg() {
		return getConstBoolean(offset + 0, $dlv_slip_print_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 0, $dlv_slip_print_flg, value);
	}


	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public boolean purc_ddlv_dlv_slip_print_flg() {
		return getConstBoolean(offset + 1, $purc_ddlv_dlv_slip_print_flg);
	}

	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 1, $purc_ddlv_dlv_slip_print_flg, value);
	}


	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 2, $indiv_prnt_flg);
	}

	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $indiv_prnt_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

