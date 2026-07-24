package mcframe.serverMSBD.MSBDB0020;

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
 * ブロック"PoBulkRegBatch_Ins01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoBulkRegBatch_Ins01_CndR_MC_A extends MCConstRow {

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_schd_dt_fr = "po_schd_dt_fr";
	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public static final String $po_schd_dt_to = "po_schd_dt_to";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * WG for purchasing dept. 購買部門対応ワーキンググループ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * PO sheet 注文書.<p>
	 *
	 */
	public static final String $prnt_po_flg = "prnt_po_flg";
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public static final String $prnt_dlv_flg = "prnt_dlv_flg";
	/**
	 * Enter excluding the error row エラー行を除いて登録.<p>
	 *
	 */
	public static final String $skip_err_flg = "skip_err_flg";
	/**
	 * Scheduled date calculation 予定日計算.<p>
	 *
	 */
	public static final String $calc_schd_dt_flg = "calc_schd_dt_flg";


	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta po_schd_dt_fr_META = createCommonMeta($po_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_dt_to_META = createCommonMeta($po_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prnt_po_flg_META = createCommonMeta($prnt_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_dlv_flg_META = createCommonMeta($prnt_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta skip_err_flg_META = createCommonMeta($skip_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_schd_dt_flg_META = createCommonMeta($calc_schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PoBulkRegBatch_Ins01_CndR> constMetas = new ConstMetaList<PoBulkRegBatch_Ins01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			sppl_cd_META,
			po_schd_dt_fr_META,
			po_schd_dt_to_META,
			purc_usr_cd_META,
			purc_dpt_cd_META,
			purc_dpt_wg_cd_META,
			prnt_po_flg_META,
			prnt_dlv_flg_META,
			skip_err_flg_META,
			calc_schd_dt_flg_META
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
	protected PoBulkRegBatch_Ins01_CndR_MC_A(ConstMetaList<? extends PoBulkRegBatch_Ins01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoBulkRegBatch_Ins01_CndR clone() {
		return (PoBulkRegBatch_Ins01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoBulkRegBatch_Ins01_CndR createInstance() {
		return (PoBulkRegBatch_Ins01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoBulkRegBatch_Ins01_CndR getValues(String... names) {
		return (PoBulkRegBatch_Ins01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 1, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 1, $sppl_cd, value);
	}


	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_schd_dt_fr() {
		return getConstDate(offset + 2, $po_schd_dt_fr);
	}

	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public void po_schd_dt_fr(MCDate value) {
		setConstDate(offset + 2, $po_schd_dt_fr, value);
	}


	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public MCDate po_schd_dt_to() {
		return getConstDate(offset + 3, $po_schd_dt_to);
	}

	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public void po_schd_dt_to(MCDate value) {
		setConstDate(offset + 3, $po_schd_dt_to, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 4, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 4, $purc_usr_cd, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 5, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 5, $purc_dpt_cd, value);
	}


	/**
	 * WG for purchasing dept. 購買部門対応ワーキンググループ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 6, $purc_dpt_wg_cd);
	}

	/**
	 * WG for purchasing dept. 購買部門対応ワーキンググループ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 6, $purc_dpt_wg_cd, value);
	}


	/**
	 * PO sheet 注文書.<p>
	 *
	 */
	public boolean prnt_po_flg() {
		return getConstBoolean(offset + 7, $prnt_po_flg);
	}

	/**
	 * PO sheet 注文書.<p>
	 *
	 */
	public void prnt_po_flg(boolean value) {
		setConstBoolean(offset + 7, $prnt_po_flg, value);
	}


	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public boolean prnt_dlv_flg() {
		return getConstBoolean(offset + 8, $prnt_dlv_flg);
	}

	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public void prnt_dlv_flg(boolean value) {
		setConstBoolean(offset + 8, $prnt_dlv_flg, value);
	}


	/**
	 * Enter excluding the error row エラー行を除いて登録.<p>
	 *
	 */
	public boolean skip_err_flg() {
		return getConstBoolean(offset + 9, $skip_err_flg);
	}

	/**
	 * Enter excluding the error row エラー行を除いて登録.<p>
	 *
	 */
	public void skip_err_flg(boolean value) {
		setConstBoolean(offset + 9, $skip_err_flg, value);
	}


	/**
	 * Scheduled date calculation 予定日計算.<p>
	 *
	 */
	public boolean calc_schd_dt_flg() {
		return getConstBoolean(offset + 10, $calc_schd_dt_flg);
	}

	/**
	 * Scheduled date calculation 予定日計算.<p>
	 *
	 */
	public void calc_schd_dt_flg(boolean value) {
		setConstBoolean(offset + 10, $calc_schd_dt_flg, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			return po_schd_dt_fr();
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			return po_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			return prnt_po_flg();
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_dlv_flg();
		}
		if ($skip_err_flg.equalsIgnoreCase(name)) {
			return skip_err_flg();
		}
		if ($calc_schd_dt_flg.equalsIgnoreCase(name)) {
			return calc_schd_dt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			return po_schd_dt_fr();
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			return po_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			return prnt_po_flg();
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_dlv_flg();
		}
		if ($skip_err_flg.equalsIgnoreCase(name)) {
			return skip_err_flg();
		}
		if ($calc_schd_dt_flg.equalsIgnoreCase(name)) {
			return calc_schd_dt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			po_schd_dt_fr(value);
			return;
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			po_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			prnt_po_flg(value);
			return;
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			prnt_dlv_flg(value);
			return;
		}
		if ($skip_err_flg.equalsIgnoreCase(name)) {
			skip_err_flg(value);
			return;
		}
		if ($calc_schd_dt_flg.equalsIgnoreCase(name)) {
			calc_schd_dt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			po_schd_dt_fr(value);
			return;
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			po_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			prnt_po_flg(value);
			return;
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			prnt_dlv_flg(value);
			return;
		}
		if ($skip_err_flg.equalsIgnoreCase(name)) {
			skip_err_flg(value);
			return;
		}
		if ($calc_schd_dt_flg.equalsIgnoreCase(name)) {
			calc_schd_dt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

