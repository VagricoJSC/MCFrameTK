package mcframe.serverMSBE.MSBEL1760;

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
 * "MSBEL_ExActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ExActListReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL1760";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ExActListReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL1760_Srch01_INFO;
		this.aSrch01 = ((MSBEL_ExActListReg)this).new Srch01();
	}

	public static MSBEL_ExActListReg.Srch01 crtSrch01() {
		MSBEL_ExActListReg lgc = new MSBEL_ExActListReg();
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
	public mcframe.serverMSBE.MSBEL1760.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL1760.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBE.MSBEL1760.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Srch01_RsltR.class);
	}

	/**
	 * Srch01_ShipPrCntブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR createSrch01_ShipPrCntR(){
		return mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR.create();
	}

	/**
	 * Srch01_ShipPrCntブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR> createSrch01_ShipPrCntL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR.class);
	}
	protected MSBEL_ExActListReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL1760_Chk01_INFO;
		this.aChk01 = ((MSBEL_ExActListReg)this).new Chk01();
	}

	public static MSBEL_ExActListReg.Chk01 crtChk01() {
		MSBEL_ExActListReg lgc = new MSBEL_ExActListReg();
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
		p.addUpBlock(aChk01.up2());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_HdrR.create();
	}

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
	}

	/**
	 * Chk01_ShipPrCntブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR createChk01_ShipPrCntR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.create();
	}

	/**
	 * Chk01_ShipPrCntブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> createChk01_ShipPrCntL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
	}
	protected MSBEL_ExActListReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL1760_Upd01_INFO;
		this.aUpd01 = ((MSBEL_ExActListReg)this).new Upd01();
	}

	public static MSBEL_ExActListReg.Upd01 crtUpd01() {
		MSBEL_ExActListReg lgc = new MSBEL_ExActListReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_HdrR.create();
	}

	/**
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
	}

	/**
	 * Upd01_ShipPrCntブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR createUpd01_ShipPrCntR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.create();
	}

	/**
	 * Upd01_ShipPrCntブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> createUpd01_ShipPrCntL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
	}
	protected MSBEL_ExActListReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL1760_Del01_INFO;
		this.aDel01 = ((MSBEL_ExActListReg)this).new Del01();
	}

	public static MSBEL_ExActListReg.Del01 crtDel01() {
		MSBEL_ExActListReg lgc = new MSBEL_ExActListReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
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
	public mcframe.serverMSBE.MSBEL1760.Chk01_RsltR createDel01_RsltR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
	}

	/**
	 * Del01_ShipPrCntブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR createDel01_ShipPrCntR(){
		return mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.create();
	}

	/**
	 * Del01_ShipPrCntブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> createDel01_ShipPrCntL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 輸出実績登録対象のインボイス情報を検索する<br>
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
		private final mcframe.serverMSBE.MSBEL1760.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1760.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1760.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR.class);

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
			invoke((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this);
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
		public mcframe.serverMSBE.MSBEL1760.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL1760.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBE.MSBEL1760.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Srch01_RsltR.class);
		}

		/**
		 * Srch01_ShipPrCntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR createSrch01_ShipPrCntR(){
			return mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR.create();
		}

		/**
		 * Srch01_ShipPrCntブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR> createSrch01_ShipPrCntL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>is_crt</td></tr>
		 * 	<tr><td><br></td><td>is_upd_del</td></tr>
		 * 	<tr><td><br></td><td>is_ref</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>rqst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>rqst_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1760.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1760.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_nm</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ttl_iv_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_ncv_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_base_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_freight_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_insurance_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_other_amt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Srch01_ShipPrCntR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 輸出実績の登録前チェックをする<br>
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
		private final mcframe.serverMSBE.MSBEL1760.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1760.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_HdrR.create();
		}

		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
		}

		/**
		 * Chk01_ShipPrCntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR createChk01_ShipPrCntR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.create();
		}

		/**
		 * Chk01_ShipPrCntブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> createChk01_ShipPrCntL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1760.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 輸出実績を登録・訂正する<br>
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
		private final mcframe.serverMSBE.MSBEL1760.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1760.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_HdrR.create();
		}

		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
		}

		/**
		 * Upd01_ShipPrCntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR createUpd01_ShipPrCntR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.create();
		}

		/**
		 * Upd01_ShipPrCntブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> createUpd01_ShipPrCntL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1760.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> up2() {
			return up2;
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
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 輸出実績を取り消す<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);

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
			invoke((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_RsltR createDel01_RsltR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_RsltR.class);
		}

		/**
		 * Del01_ShipPrCntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR createDel01_ShipPrCntR(){
			return mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.create();
		}

		/**
		 * Del01_ShipPrCntブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> createDel01_ShipPrCntL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_ShipPrCntR> up1() {
			return up1;
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
		public MCList<mcframe.serverMSBE.MSBEL1760.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActListReg)MSBEL_ExActListReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}