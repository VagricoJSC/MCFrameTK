package mcframe.serverMSBH.MSBHL5070;

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
 * "MSBHL_PayActIfCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PayActIfCrtService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PayActIfCrtService.PayActIfCrt_Ins01 aPayActIfCrt_Ins01;

	protected void initPayActIfCrt_Ins01() {
		this.info = PDef.MS_MSBHL5070_PayActIfCrt_Ins01_INFO;
		this.aPayActIfCrt_Ins01 = ((MSBHL_PayActIfCrtService)this).new PayActIfCrt_Ins01();
	}

	public static MSBHL_PayActIfCrtService.PayActIfCrt_Ins01 crtPayActIfCrt_Ins01() {
		MSBHL_PayActIfCrtService lgc = new MSBHL_PayActIfCrtService();
		lgc.initPayActIfCrt_Ins01();
		return lgc.aPayActIfCrt_Ins01;
	}

	protected void paramPayActIfCrt_Ins01(MCParam p) {
		if (this.aPayActIfCrt_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPayActIfCrt_Ins01.up0());
	}

	protected void doPayActIfCrt_Ins01() {
		aPayActIfCrt_Ins01.call();
	};

	/**
	 * PayActIfCrt_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR createPayActIfCrt_Ins01_CndR(){
		return mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR.create();
	}

	/**
	 * PayActIfCrt_Ins01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR> createPayActIfCrt_Ins01_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR.class);
	}

	/**
	 * PayActIfCrt_Ins01_PayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR createPayActIfCrt_Ins01_PayActR(){
		return mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR.create();
	}

	/**
	 * PayActIfCrt_Ins01_XrateRevHisブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR createPayActIfCrt_Ins01_XrateRevHisR(){
		return mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PayActIfCrt_Ins01オペレーション.<p>
	 *
	 * 支払実績、支払実績明細、為替差損益、支払手形の情報をもとに支払実績ＩＦを作成する。<br>
	 */
	abstract public class PayActIfCrt_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PayActIfCrt_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR> up0;
		/** [PayActIfCrt_Ins01_PayAct]ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR aPayActIfCrt_Ins01_PayAct;
		/** [PayActIfCrt_Ins01_XrateRevHis]ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR aPayActIfCrt_Ins01_XrateRevHis;
		
		
		// コンストラクタ
		protected PayActIfCrt_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR.class);
			aPayActIfCrt_Ins01_PayAct = mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR.create();
			aPayActIfCrt_Ins01_XrateRevHis = mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR.create();

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
			invoke((MSBHL_PayActIfCrtService)MSBHL_PayActIfCrtService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PayActIfCrt_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR createPayActIfCrt_Ins01_CndR(){
			return mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR.create();
		}

		/**
		 * PayActIfCrt_Ins01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR> createPayActIfCrt_Ins01_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR.class);
		}

		/**
		 * PayActIfCrt_Ins01_PayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR createPayActIfCrt_Ins01_PayActR(){
			return mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR.create();
		}

		/**
		 * PayActIfCrt_Ins01_XrateRevHisブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR createPayActIfCrt_Ins01_XrateRevHisR(){
			return mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_xrate_rev_his_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_xrate_rev_his_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_CndR> up0() {
			return up0;
		}



		/**
		 * [PayActIfCrt_Ins01_PayAct]ブロックのコンテナaPayActIfCrt_Ins01_PayActRを返します。
		 *
		 * @return PayActIfCrt_Ins01_PayActR
		 */
		public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_PayActR PayActIfCrt_Ins01_PayAct() {
			return aPayActIfCrt_Ins01_PayAct;
		}

		/**
		 * [PayActIfCrt_Ins01_XrateRevHis]ブロックのコンテナaPayActIfCrt_Ins01_XrateRevHisRを返します。
		 *
		 * @return PayActIfCrt_Ins01_XrateRevHisR
		 */
		public mcframe.serverMSBH.MSBHL5070.PayActIfCrt_Ins01_XrateRevHisR PayActIfCrt_Ins01_XrateRevHis() {
			return aPayActIfCrt_Ins01_XrateRevHis;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActIfCrtService)MSBHL_PayActIfCrtService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}