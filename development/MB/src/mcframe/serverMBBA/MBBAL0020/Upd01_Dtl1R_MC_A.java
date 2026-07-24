package mcframe.serverMBBA.MBBAL0020;

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
 * ブロック"Upd01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public static final String $aprv_no_seq = "aprv_no_seq";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public static final String $aprv_d_sts_typ = "aprv_d_sts_typ";
	/**
	 * Approval executor cd. 承認実行者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public static final String $aprv_d_rmrks = "aprv_d_rmrks";
	/**
	 * Approval details spare 1 承認明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Approval details spare 2 承認明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Approval details spare 3 承認明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";


	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_d_sts_typ_META = createCommonMeta($aprv_d_sts_typ, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_d_rmrks_META = createCommonMeta($aprv_d_rmrks, mcframe.commonMA.meta.MA_META.APRV_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR3);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<Upd01_Dtl1R> constMetas = new ConstMetaList<Upd01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aprv_no_META,
			aprv_no_seq_META,
			aprv_role_cd_META,
			aprv_usr_cd_META,
			aprv_d_sts_typ_META,
			act_usr_cd_META,
			aprv_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			upd_cntr_META,
			upd_cntr_chk_flg_META,
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META
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
	protected Upd01_Dtl1R_MC_A(ConstMetaList<? extends Upd01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl1R clone() {
		return (Upd01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl1R createInstance() {
		return (Upd01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl1R getValues(String... names) {
		return (Upd01_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 0, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 0, $aprv_no, value);
	}


	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 1, $aprv_no_seq);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 2, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 2, $aprv_role_cd, value);
	}


	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 3, $aprv_usr_cd);
	}

	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 3, $aprv_usr_cd, value);
	}


	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public String aprv_d_sts_typ() {
		return getConstString(offset + 4, $aprv_d_sts_typ);
	}

	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public void aprv_d_sts_typ(String value) {
		setConstString(offset + 4, $aprv_d_sts_typ, value);
	}


	/**
	 * Approval executor cd. 承認実行者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 5, $act_usr_cd);
	}

	/**
	 * Approval executor cd. 承認実行者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 5, $act_usr_cd, value);
	}


	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public String aprv_d_rmrks() {
		return getConstString(offset + 6, $aprv_d_rmrks);
	}

	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public void aprv_d_rmrks(String value) {
		setConstString(offset + 6, $aprv_d_rmrks, value);
	}


	/**
	 * Approval details spare 1 承認明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 7, $sub_char1);
	}

	/**
	 * Approval details spare 1 承認明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 7, $sub_char1, value);
	}


	/**
	 * Approval details spare 2 承認明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 8, $sub_char2);
	}

	/**
	 * Approval details spare 2 承認明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 8, $sub_char2, value);
	}


	/**
	 * Approval details spare 3 承認明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 9, $sub_char3);
	}

	/**
	 * Approval details spare 3 承認明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 9, $sub_char3, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 10, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 10, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 10, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 10, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 10, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 10, $upd_cntr, value);
	}


	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 11, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 11, $upd_cntr_chk_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 12, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 12, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 12, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 13, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 13, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 14, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 14, $rtn_sts_typ, value);
	}


	public String getString(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			return aprv_d_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			return aprv_d_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			aprv_d_sts_typ(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			aprv_d_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			aprv_d_sts_typ(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			aprv_d_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

