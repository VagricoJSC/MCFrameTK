package mcframe.serverMSBG.MSBGL5090;

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
 * "MSBGL_RcvActIfCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_RcvActIfCrtService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_RcvActIfCrtService.RcvActIfCrt_Ins01 aRcvActIfCrt_Ins01;

	protected void initRcvActIfCrt_Ins01() {
		this.info = PDef.MS_MSBGL5090_RcvActIfCrt_Ins01_INFO;
		this.aRcvActIfCrt_Ins01 = ((MSBGL_RcvActIfCrtService)this).new RcvActIfCrt_Ins01();
	}

	public static MSBGL_RcvActIfCrtService.RcvActIfCrt_Ins01 crtRcvActIfCrt_Ins01() {
		MSBGL_RcvActIfCrtService lgc = new MSBGL_RcvActIfCrtService();
		lgc.initRcvActIfCrt_Ins01();
		return lgc.aRcvActIfCrt_Ins01;
	}

	protected void paramRcvActIfCrt_Ins01(MCParam p) {
		if (this.aRcvActIfCrt_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActIfCrt_Ins01.up0());
	}

	protected void doRcvActIfCrt_Ins01() {
		aRcvActIfCrt_Ins01.call();
	};

	/**
	 * RcvActIfCrt_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR createRcvActIfCrt_Ins01_CndR(){
		return mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR.create();
	}

	/**
	 * RcvActIfCrt_Ins01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR> createRcvActIfCrt_Ins01_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR.class);
	}

	/**
	 * RcvActIfCrt_Ins01_RcvActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR createRcvActIfCrt_Ins01_RcvActR(){
		return mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR.create();
	}

	/**
	 * RcvActIfCrt_Ins01_XrateRevHisブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR createRcvActIfCrt_Ins01_XrateRevHisR(){
		return mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RcvActIfCrt_Ins01オペレーション.<p>
	 *
	 * 入金実績、入金実績明細、為替レート評価替履歴、為替差損益の情報をもとに入金実績ＩＦを作成する。<br>
	 */
	abstract public class RcvActIfCrt_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActIfCrt_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR> up0;
		/** [RcvActIfCrt_Ins01_RcvAct]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR aRcvActIfCrt_Ins01_RcvAct;
		/** [RcvActIfCrt_Ins01_XrateRevHis]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR aRcvActIfCrt_Ins01_XrateRevHis;
		
		
		// コンストラクタ
		protected RcvActIfCrt_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR.class);
			aRcvActIfCrt_Ins01_RcvAct = mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR.create();
			aRcvActIfCrt_Ins01_XrateRevHis = mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvActIfCrtService)MSBGL_RcvActIfCrtService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcvActIfCrt_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR createRcvActIfCrt_Ins01_CndR(){
			return mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR.create();
		}

		/**
		 * RcvActIfCrt_Ins01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR> createRcvActIfCrt_Ins01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR.class);
		}

		/**
		 * RcvActIfCrt_Ins01_RcvActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR createRcvActIfCrt_Ins01_RcvActR(){
			return mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR.create();
		}

		/**
		 * RcvActIfCrt_Ins01_XrateRevHisブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR createRcvActIfCrt_Ins01_XrateRevHisR(){
			return mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ar_xrate_rev_his_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ar_xrate_rev_his_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_CndR> up0() {
			return up0;
		}



		/**
		 * [RcvActIfCrt_Ins01_RcvAct]ブロックのコンテナaRcvActIfCrt_Ins01_RcvActRを返します。
		 *
		 * @return RcvActIfCrt_Ins01_RcvActR
		 */
		public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_RcvActR RcvActIfCrt_Ins01_RcvAct() {
			return aRcvActIfCrt_Ins01_RcvAct;
		}

		/**
		 * [RcvActIfCrt_Ins01_XrateRevHis]ブロックのコンテナaRcvActIfCrt_Ins01_XrateRevHisRを返します。
		 *
		 * @return RcvActIfCrt_Ins01_XrateRevHisR
		 */
		public mcframe.serverMSBG.MSBGL5090.RcvActIfCrt_Ins01_XrateRevHisR RcvActIfCrt_Ins01_XrateRevHis() {
			return aRcvActIfCrt_Ins01_XrateRevHis;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActIfCrtService)MSBGL_RcvActIfCrtService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}