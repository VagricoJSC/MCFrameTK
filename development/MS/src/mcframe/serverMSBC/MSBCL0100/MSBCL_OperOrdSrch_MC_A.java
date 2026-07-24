package mcframe.serverMSBC.MSBCL0100;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBCL_OperOrdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_OperOrdSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_OperOrdSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL0100_Srch01_INFO;
		this.aSrch01 = ((MSBCL_OperOrdSrch)this).new Srch01();
	}

	public static MSBCL_OperOrdSrch.Srch01 crtSrch01() {
		MSBCL_OperOrdSrch lgc = new MSBCL_OperOrdSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0100.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL0100.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0100.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBC.MSBCL0100.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0100.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0100.Srch01_RsltR.class);
	}
	protected MSBCL_OperOrdSrch.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBCL0100_Chk01_INFO;
		this.aChk01 = ((MSBCL_OperOrdSrch)this).new Chk01();
	}

	public static MSBCL_OperOrdSrch.Chk01 crtChk01() {
		MSBCL_OperOrdSrch lgc = new MSBCL_OperOrdSrch();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0100.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);
	}
	protected MSBCL_OperOrdSrch.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBCL0100_Chk02_INFO;
		this.aChk02 = ((MSBCL_OperOrdSrch)this).new Chk02();
	}

	public static MSBCL_OperOrdSrch.Chk02 crtChk02() {
		MSBCL_OperOrdSrch lgc = new MSBCL_OperOrdSrch();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addDownBlock(aChk02.down0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0100.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);
	}
	protected MSBCL_OperOrdSrch.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBCL0100_Upd01_INFO;
		this.aUpd01 = ((MSBCL_OperOrdSrch)this).new Upd01();
	}

	public static MSBCL_OperOrdSrch.Upd01 crtUpd01() {
		MSBCL_OperOrdSrch lgc = new MSBCL_OperOrdSrch();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0100.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);
	}
	protected MSBCL_OperOrdSrch.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MS_MSBCL0100_Imp01_INFO;
		this.aImp01 = ((MSBCL_OperOrdSrch)this).new Imp01();
	}

	public static MSBCL_OperOrdSrch.Imp01 crtImp01() {
		MSBCL_OperOrdSrch lgc = new MSBCL_OperOrdSrch();
		lgc.initImp01();
		return lgc.aImp01;
	}

	protected void paramImp01(MCParam p) {
		if (this.aImp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp01.up0());
		p.addDownBlock(aImp01.down0());
	}

	protected void doImp01() {
		aImp01.call();
	};

	/**
	 * Imp01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0100.Chk02_DtlR createImp01_DtlR(){
		return mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.create();
	}

	/**
	 * Imp01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> createImp01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工程オーダを検索する。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0100.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0100.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL0100.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0100.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBC.MSBCL0100.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0100.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>part_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_rcv_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_ord_rcv_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_snd_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_ord_snd_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0100.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL0100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>inst_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>act_st_dt</td></tr>
		 * 	<tr><td><br></td><td>act_st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>inst_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>act_end_dt</td></tr>
		 * 	<tr><td><br></td><td>act_end_hm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>itm_order_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 工程オーダを更新ためにチェックを行う。<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0100.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no_d</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.fix_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>ord.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no_d</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * ファイルから工程オーダを取り込むために、チェックを行う。<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0100.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 工程オーダを更新する。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0100.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_d</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ工程オーダのチェック処理を行う。<br>
	 */
	abstract public class Imp01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Imp01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0100.Chk02_DtlR createImp01_DtlR(){
			return mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.create();
		}

		/**
		 * Imp01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> createImp01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0100.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0100.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OperOrdSrch)MSBCL_OperOrdSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}