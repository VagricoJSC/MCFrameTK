package mcframe.serverMSBA.MSBAL0100;

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
 * "MSBAL_WgRqstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAL_WgRqstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBAL0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBAL_WgRqstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBAL0100_Srch01_INFO;
		this.aSrch01 = ((MSBAL_WgRqstReg)this).new Srch01();
	}

	public static MSBAL_WgRqstReg.Srch01 crtSrch01() {
		MSBAL_WgRqstReg lgc = new MSBAL_WgRqstReg();
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
		p.addDownBlock(aSrch01.down1());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBA.MSBAL0100.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R.class);
	}
	protected MSBAL_WgRqstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBAL0100_Chk01_INFO;
		this.aChk01 = ((MSBAL_WgRqstReg)this).new Chk01();
	}

	public static MSBAL_WgRqstReg.Chk01 crtChk01() {
		MSBAL_WgRqstReg lgc = new MSBAL_WgRqstReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
	}

	/**
	 * Chk01_CrtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR createChk01_CrtlR(){
		return mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR.create();
	}
	protected MSBAL_WgRqstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBAL0100_Chk02_INFO;
		this.aChk02 = ((MSBAL_WgRqstReg)this).new Chk02();
	}

	public static MSBAL_WgRqstReg.Chk02 crtChk02() {
		MSBAL_WgRqstReg lgc = new MSBAL_WgRqstReg();
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
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);
	}
	protected MSBAL_WgRqstReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MS_MSBAL0100_Imp01_INFO;
		this.aImp01 = ((MSBAL_WgRqstReg)this).new Imp01();
	}

	public static MSBAL_WgRqstReg.Imp01 crtImp01() {
		MSBAL_WgRqstReg lgc = new MSBAL_WgRqstReg();
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
	 * Imp01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Chk01_RsltR createImp01_RsltR(){
		return mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.create();
	}

	/**
	 * Imp01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> createImp01_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
	}
	protected MSBAL_WgRqstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBAL0100_Upd01_INFO;
		this.aUpd01 = ((MSBAL_WgRqstReg)this).new Upd01();
	}

	public static MSBAL_WgRqstReg.Upd01 crtUpd01() {
		MSBAL_WgRqstReg lgc = new MSBAL_WgRqstReg();
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
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
	}
	protected MSBAL_WgRqstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBAL0100_Del01_INFO;
		this.aDel01 = ((MSBAL_WgRqstReg)this).new Del01();
	}

	public static MSBAL_WgRqstReg.Del01 crtDel01() {
		MSBAL_WgRqstReg lgc = new MSBAL_WgRqstReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0100.Chk02_RsltR createDel01_RsltR(){
		return mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＷＧ間依頼、ＷＧ間依頼回答を検索する<br>
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
		private final mcframe.serverMSBA.MSBAL0100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBA.MSBAL0100.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBA.MSBAL0100.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>xfr_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sts_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_sts_flg</td></tr>
		 * 	<tr><td><br></td><td>part_inst_sts_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sts_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_sts_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>un_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_hm_to</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_hm_to</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_ntc_day_typ</td></tr>
		 * 	<tr><td><br></td><td>srch_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>srch_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_div_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_shrtg_flg</td></tr>
		 * 	<tr><td><br></td><td>due_delay_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_can_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBA.MSBAL0100.Srch01_CndR
		 */
		public mcframe.serverMSBA.MSBAL0100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>last_wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_dt</td></tr>
		 * 	<tr><td><br></td><td>re_prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_crrct_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_crrct_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_can_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_can_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_can_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_can_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms_rmrks</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * ＷＧ間依頼を登録・訂正するために、チェックを行う<br>
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
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
			up1 = mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR.create();
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
		}

		/**
		 * Chk01_CrtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR createChk01_CrtlR(){
			return mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>last_wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk01_CrtlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>last_wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_dt</td></tr>
		 * 	<tr><td><br></td><td>re_prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * ＷＧ間依頼を取り消すために、チェックを行う<br>
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
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);

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
			invoke((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ＷＧ間依頼をファイル入力する<br>
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
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);

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
			invoke((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk01_RsltR createImp01_RsltR(){
			return mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.create();
		}

		/**
		 * Imp01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> createImp01_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_dt</td></tr>
		 * 	<tr><td><br></td><td>re_prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＷＧ間依頼を登録・訂正する<br>
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
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);

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
			invoke((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>last_wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ＷＧ間依頼を取り消す<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);

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
			invoke((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0100.Chk02_RsltR createDel01_RsltR(){
			return mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAL0100.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0100.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_WgRqstReg)MSBAL_WgRqstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}