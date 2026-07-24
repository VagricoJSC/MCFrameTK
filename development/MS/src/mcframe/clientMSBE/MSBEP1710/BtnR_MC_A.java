package mcframe.clientMSBE.MSBEP1710;

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
	 * Select same group No. in bulk 同一グループＮＯをまとめて選択.<p>
	 *
	 */
	public static final String $chk_by_grp_no_flg = "chk_by_grp_no_flg";


	public static final MCMeta chk_by_grp_no_flg_META = createCommonMeta($chk_by_grp_no_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BtnR> constMetas = new ConstMetaList<BtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			chk_by_grp_no_flg_META
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
	/** 項目属性情報のグループ[DIF_CHK]のキー定数 */
	public static final String $$DIF_CHK = "DIF_CHK";
	/** 項目属性情報のグループ[SELECTABLE]のキー定数 */
	public static final String $$SELECTABLE = "SELECTABLE";
	/** 項目属性情報のグループ[CHK_SCRN_TRAN]のキー定数 */
	public static final String $$CHK_SCRN_TRAN = "CHK_SCRN_TRAN";
	/** 項目属性情報のグループ[SCRN_TRAN]のキー定数 */
	public static final String $$SCRN_TRAN = "SCRN_TRAN";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
		)),
		new MCExtMap.Entry($$DIF_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SELECTABLE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_SCRN_TRAN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SCRN_TRAN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * Select same group No. in bulk 同一グループＮＯをまとめて選択.<p>
	 *
	 */
	public boolean chk_by_grp_no_flg() {
		return getConstBoolean(offset + 0, $chk_by_grp_no_flg);
	}

	/**
	 * Select same group No. in bulk 同一グループＮＯをまとめて選択.<p>
	 *
	 */
	public void chk_by_grp_no_flg(boolean value) {
		setConstBoolean(offset + 0, $chk_by_grp_no_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($chk_by_grp_no_flg.equalsIgnoreCase(name)) {
			return chk_by_grp_no_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($chk_by_grp_no_flg.equalsIgnoreCase(name)) {
			return chk_by_grp_no_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($chk_by_grp_no_flg.equalsIgnoreCase(name)) {
			chk_by_grp_no_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($chk_by_grp_no_flg.equalsIgnoreCase(name)) {
			chk_by_grp_no_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

