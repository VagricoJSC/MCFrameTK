package mcframe.clientMSBF.MSBFP0050;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Check date 確認日.<p>
	 *
	 */
	public static final String $cnf_dt = "cnf_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";

	public static final String $cnf_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $cnf_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $cnf_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $cnf_dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta cnf_dt_META = createCommonMeta($cnf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cnf_dt_META,
			usr_dpt_p_META
		},
		new String[][]{
			{
				"cnf_usr_cd",
				"cnf_usr_nm",
				"cnf_dpt_cd",
				"cnf_dpt_nm"
			},
			{
				$cnf_usr_cd,
				$cnf_usr_nm,
				$cnf_dpt_cd,
				$cnf_dpt_nm
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "cnf_usr_cd;cnf_dt;MAC_DPT_IS_SRCH_TYP.INSP"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Check date 確認日.<p>
	 *
	 */
	public MCDate cnf_dt() {
		return getConstDate(offset + 0, $cnf_dt);
	}

	/**
	 * Check date 確認日.<p>
	 *
	 */
	public void cnf_dt(MCDate value) {
		setConstDate(offset + 0, $cnf_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $usr_dpt_p, row);
	}


	public MCDate getDate(String name) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			return cnf_dt();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			return cnf_dt();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			cnf_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			cnf_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public String cnf_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public void cnf_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public String cnf_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public void cnf_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public String cnf_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public void cnf_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public String cnf_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public void cnf_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

