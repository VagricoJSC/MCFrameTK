package mcframe.serverMSBI.MSBIL5010;

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
 * ブロック"Cl_Chk03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Cl_Chk03_CndR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Check sales closing 売上締チェック.<p>
	 *
	 */
	public static final String $sls_cls_chk_flg = "sls_cls_chk_flg";
	/**
	 * Check for payment received closing 入金締チェック.<p>
	 *
	 */
	public static final String $rcv_cls_chk_flg = "rcv_cls_chk_flg";
	/**
	 * Purchase closing check 仕入締チェック.<p>
	 *
	 */
	public static final String $purc_cls_chk_flg = "purc_cls_chk_flg";
	/**
	 * Payment closing check 支払締チェック.<p>
	 *
	 */
	public static final String $pay_cls_chk_flg = "pay_cls_chk_flg";
	/**
	 * Inventory closing check 在庫締チェック.<p>
	 *
	 */
	public static final String $stk_cls_chk_flg = "stk_cls_chk_flg";
	/**
	 * No GR/GI restriction needed 入出庫制限不要.<p>
	 *
	 */
	public static final String $io_lmt_skip_flg = "io_lmt_skip_flg";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * BP cd. before change 変更前取引先ＣＤ.<p>
	 *
	 */
	public static final String $old_bp_cd = "old_bp_cd";
	/**
	 * Location cd. before change 変更前場所ＣＤ.<p>
	 *
	 */
	public static final String $old_loc_cd = "old_loc_cd";
	/**
	 * Item cd. before change 変更前品目ＣＤ.<p>
	 *
	 */
	public static final String $old_itm_cd = "old_itm_cd";
	/**
	 * Branch No. 1 before change 変更前枝番１.<p>
	 *
	 */
	public static final String $old_itm_sub1 = "old_itm_sub1";
	/**
	 * Branch No. 2 before change 変更前枝番２.<p>
	 *
	 */
	public static final String $old_itm_sub2 = "old_itm_sub2";
	/**
	 * Branch No. 3 before change 変更前枝番３.<p>
	 *
	 */
	public static final String $old_itm_sub3 = "old_itm_sub3";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_cls_chk_flg_META = createCommonMeta($sls_cls_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cls_chk_flg_META = createCommonMeta($rcv_cls_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cls_chk_flg_META = createCommonMeta($purc_cls_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cls_chk_flg_META = createCommonMeta($pay_cls_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_cls_chk_flg_META = createCommonMeta($stk_cls_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_lmt_skip_flg_META = createCommonMeta($io_lmt_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta old_bp_cd_META = createCommonMeta($old_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta old_loc_cd_META = createCommonMeta($old_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta old_itm_cd_META = createCommonMeta($old_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta old_itm_sub1_META = createCommonMeta($old_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta old_itm_sub2_META = createCommonMeta($old_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta old_itm_sub3_META = createCommonMeta($old_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Cl_Chk03_CndR> constMetas = new ConstMetaList<Cl_Chk03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			ac_dt_META,
			can_ac_dt_META,
			sls_cls_chk_flg_META,
			rcv_cls_chk_flg_META,
			purc_cls_chk_flg_META,
			pay_cls_chk_flg_META,
			stk_cls_chk_flg_META,
			io_lmt_skip_flg_META,
			bp_cd_META,
			loc_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			old_bp_cd_META,
			old_loc_cd_META,
			old_itm_cd_META,
			old_itm_sub1_META,
			old_itm_sub2_META,
			old_itm_sub3_META,
			err_flg_META
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
	protected Cl_Chk03_CndR_MC_A(ConstMetaList<? extends Cl_Chk03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cl_Chk03_CndR clone() {
		return (Cl_Chk03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cl_Chk03_CndR createInstance() {
		return (Cl_Chk03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cl_Chk03_CndR getValues(String... names) {
		return (Cl_Chk03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 1, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 1, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 2, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 2, $can_ac_dt, value);
	}


	/**
	 * Check sales closing 売上締チェック.<p>
	 *
	 */
	public boolean sls_cls_chk_flg() {
		return getConstBoolean(offset + 3, $sls_cls_chk_flg);
	}

	/**
	 * Check sales closing 売上締チェック.<p>
	 *
	 */
	public void sls_cls_chk_flg(boolean value) {
		setConstBoolean(offset + 3, $sls_cls_chk_flg, value);
	}


	/**
	 * Check for payment received closing 入金締チェック.<p>
	 *
	 */
	public boolean rcv_cls_chk_flg() {
		return getConstBoolean(offset + 4, $rcv_cls_chk_flg);
	}

	/**
	 * Check for payment received closing 入金締チェック.<p>
	 *
	 */
	public void rcv_cls_chk_flg(boolean value) {
		setConstBoolean(offset + 4, $rcv_cls_chk_flg, value);
	}


	/**
	 * Purchase closing check 仕入締チェック.<p>
	 *
	 */
	public boolean purc_cls_chk_flg() {
		return getConstBoolean(offset + 5, $purc_cls_chk_flg);
	}

	/**
	 * Purchase closing check 仕入締チェック.<p>
	 *
	 */
	public void purc_cls_chk_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_cls_chk_flg, value);
	}


	/**
	 * Payment closing check 支払締チェック.<p>
	 *
	 */
	public boolean pay_cls_chk_flg() {
		return getConstBoolean(offset + 6, $pay_cls_chk_flg);
	}

	/**
	 * Payment closing check 支払締チェック.<p>
	 *
	 */
	public void pay_cls_chk_flg(boolean value) {
		setConstBoolean(offset + 6, $pay_cls_chk_flg, value);
	}


	/**
	 * Inventory closing check 在庫締チェック.<p>
	 *
	 */
	public boolean stk_cls_chk_flg() {
		return getConstBoolean(offset + 7, $stk_cls_chk_flg);
	}

	/**
	 * Inventory closing check 在庫締チェック.<p>
	 *
	 */
	public void stk_cls_chk_flg(boolean value) {
		setConstBoolean(offset + 7, $stk_cls_chk_flg, value);
	}


	/**
	 * No GR/GI restriction needed 入出庫制限不要.<p>
	 *
	 */
	public boolean io_lmt_skip_flg() {
		return getConstBoolean(offset + 8, $io_lmt_skip_flg);
	}

	/**
	 * No GR/GI restriction needed 入出庫制限不要.<p>
	 *
	 */
	public void io_lmt_skip_flg(boolean value) {
		setConstBoolean(offset + 8, $io_lmt_skip_flg, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 9, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 9, $bp_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 10, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 10, $loc_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 11, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 11, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 12, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 12, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 13, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 13, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 14, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 14, $itm_sub3, value);
	}


	/**
	 * BP cd. before change 変更前取引先ＣＤ.<p>
	 *
	 */
	public String old_bp_cd() {
		return getConstString(offset + 15, $old_bp_cd);
	}

	/**
	 * BP cd. before change 変更前取引先ＣＤ.<p>
	 *
	 */
	public void old_bp_cd(String value) {
		setConstString(offset + 15, $old_bp_cd, value);
	}


	/**
	 * Location cd. before change 変更前場所ＣＤ.<p>
	 *
	 */
	public String old_loc_cd() {
		return getConstString(offset + 16, $old_loc_cd);
	}

	/**
	 * Location cd. before change 変更前場所ＣＤ.<p>
	 *
	 */
	public void old_loc_cd(String value) {
		setConstString(offset + 16, $old_loc_cd, value);
	}


	/**
	 * Item cd. before change 変更前品目ＣＤ.<p>
	 *
	 */
	public String old_itm_cd() {
		return getConstString(offset + 17, $old_itm_cd);
	}

	/**
	 * Item cd. before change 変更前品目ＣＤ.<p>
	 *
	 */
	public void old_itm_cd(String value) {
		setConstString(offset + 17, $old_itm_cd, value);
	}


	/**
	 * Branch No. 1 before change 変更前枝番１.<p>
	 *
	 */
	public String old_itm_sub1() {
		return getConstString(offset + 18, $old_itm_sub1);
	}

	/**
	 * Branch No. 1 before change 変更前枝番１.<p>
	 *
	 */
	public void old_itm_sub1(String value) {
		setConstString(offset + 18, $old_itm_sub1, value);
	}


	/**
	 * Branch No. 2 before change 変更前枝番２.<p>
	 *
	 */
	public String old_itm_sub2() {
		return getConstString(offset + 19, $old_itm_sub2);
	}

	/**
	 * Branch No. 2 before change 変更前枝番２.<p>
	 *
	 */
	public void old_itm_sub2(String value) {
		setConstString(offset + 19, $old_itm_sub2, value);
	}


	/**
	 * Branch No. 3 before change 変更前枝番３.<p>
	 *
	 */
	public String old_itm_sub3() {
		return getConstString(offset + 20, $old_itm_sub3);
	}

	/**
	 * Branch No. 3 before change 変更前枝番３.<p>
	 *
	 */
	public void old_itm_sub3(String value) {
		setConstString(offset + 20, $old_itm_sub3, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 21, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 21, $err_flg, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($old_bp_cd.equalsIgnoreCase(name)) {
			return old_bp_cd();
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			return old_loc_cd();
		}
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			return old_itm_cd();
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			return old_itm_sub1();
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			return old_itm_sub2();
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			return old_itm_sub3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sls_cls_chk_flg.equalsIgnoreCase(name)) {
			return sls_cls_chk_flg();
		}
		if ($rcv_cls_chk_flg.equalsIgnoreCase(name)) {
			return rcv_cls_chk_flg();
		}
		if ($purc_cls_chk_flg.equalsIgnoreCase(name)) {
			return purc_cls_chk_flg();
		}
		if ($pay_cls_chk_flg.equalsIgnoreCase(name)) {
			return pay_cls_chk_flg();
		}
		if ($stk_cls_chk_flg.equalsIgnoreCase(name)) {
			return stk_cls_chk_flg();
		}
		if ($io_lmt_skip_flg.equalsIgnoreCase(name)) {
			return io_lmt_skip_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($old_bp_cd.equalsIgnoreCase(name)) {
			return old_bp_cd();
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			return old_loc_cd();
		}
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			return old_itm_cd();
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			return old_itm_sub1();
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			return old_itm_sub2();
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			return old_itm_sub3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sls_cls_chk_flg.equalsIgnoreCase(name)) {
			return sls_cls_chk_flg();
		}
		if ($rcv_cls_chk_flg.equalsIgnoreCase(name)) {
			return rcv_cls_chk_flg();
		}
		if ($purc_cls_chk_flg.equalsIgnoreCase(name)) {
			return purc_cls_chk_flg();
		}
		if ($pay_cls_chk_flg.equalsIgnoreCase(name)) {
			return pay_cls_chk_flg();
		}
		if ($stk_cls_chk_flg.equalsIgnoreCase(name)) {
			return stk_cls_chk_flg();
		}
		if ($io_lmt_skip_flg.equalsIgnoreCase(name)) {
			return io_lmt_skip_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($old_bp_cd.equalsIgnoreCase(name)) {
			old_bp_cd(value);
			return;
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			old_loc_cd(value);
			return;
		}
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			old_itm_cd(value);
			return;
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			old_itm_sub1(value);
			return;
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			old_itm_sub2(value);
			return;
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			old_itm_sub3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sls_cls_chk_flg.equalsIgnoreCase(name)) {
			sls_cls_chk_flg(value);
			return;
		}
		if ($rcv_cls_chk_flg.equalsIgnoreCase(name)) {
			rcv_cls_chk_flg(value);
			return;
		}
		if ($purc_cls_chk_flg.equalsIgnoreCase(name)) {
			purc_cls_chk_flg(value);
			return;
		}
		if ($pay_cls_chk_flg.equalsIgnoreCase(name)) {
			pay_cls_chk_flg(value);
			return;
		}
		if ($stk_cls_chk_flg.equalsIgnoreCase(name)) {
			stk_cls_chk_flg(value);
			return;
		}
		if ($io_lmt_skip_flg.equalsIgnoreCase(name)) {
			io_lmt_skip_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($old_bp_cd.equalsIgnoreCase(name)) {
			old_bp_cd(value);
			return;
		}
		if ($old_loc_cd.equalsIgnoreCase(name)) {
			old_loc_cd(value);
			return;
		}
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			old_itm_cd(value);
			return;
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			old_itm_sub1(value);
			return;
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			old_itm_sub2(value);
			return;
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			old_itm_sub3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sls_cls_chk_flg.equalsIgnoreCase(name)) {
			sls_cls_chk_flg(value);
			return;
		}
		if ($rcv_cls_chk_flg.equalsIgnoreCase(name)) {
			rcv_cls_chk_flg(value);
			return;
		}
		if ($purc_cls_chk_flg.equalsIgnoreCase(name)) {
			purc_cls_chk_flg(value);
			return;
		}
		if ($pay_cls_chk_flg.equalsIgnoreCase(name)) {
			pay_cls_chk_flg(value);
			return;
		}
		if ($stk_cls_chk_flg.equalsIgnoreCase(name)) {
			stk_cls_chk_flg(value);
			return;
		}
		if ($io_lmt_skip_flg.equalsIgnoreCase(name)) {
			io_lmt_skip_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

