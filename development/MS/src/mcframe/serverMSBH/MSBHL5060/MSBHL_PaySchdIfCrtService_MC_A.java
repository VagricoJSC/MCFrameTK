package mcframe.serverMSBH.MSBHL5060;

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
 * "MSBHL_PaySchdIfCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PaySchdIfCrtService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL5060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PaySchdIfCrtService.PaySchdIfCrt_Ins01 aPaySchdIfCrt_Ins01;

	protected void initPaySchdIfCrt_Ins01() {
		this.info = PDef.MS_MSBHL5060_PaySchdIfCrt_Ins01_INFO;
		this.aPaySchdIfCrt_Ins01 = ((MSBHL_PaySchdIfCrtService)this).new PaySchdIfCrt_Ins01();
	}

	public static MSBHL_PaySchdIfCrtService.PaySchdIfCrt_Ins01 crtPaySchdIfCrt_Ins01() {
		MSBHL_PaySchdIfCrtService lgc = new MSBHL_PaySchdIfCrtService();
		lgc.initPaySchdIfCrt_Ins01();
		return lgc.aPaySchdIfCrt_Ins01;
	}

	protected void paramPaySchdIfCrt_Ins01(MCParam p) {
		if (this.aPaySchdIfCrt_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchdIfCrt_Ins01.up0());
	}

	protected void doPaySchdIfCrt_Ins01() {
		aPaySchdIfCrt_Ins01.call();
	};

	/**
	 * PaySchdIfCrt_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR createPaySchdIfCrt_Ins01_CndR(){
		return mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR.create();
	}

	/**
	 * PaySchdIfCrt_Ins01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR> createPaySchdIfCrt_Ins01_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR.class);
	}

	/**
	 * PaySchdIfCrt_Ins01_PaySchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR createPaySchdIfCrt_Ins01_PaySchdR(){
		return mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PaySchdIfCrt_Ins01オペレーション.<p>
	 *
	 * 支払予定、支払手形の情報をもとに支払予定ＩＦを作成する。<br>
	 */
	abstract public class PaySchdIfCrt_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchdIfCrt_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR> up0;
		/** [PaySchdIfCrt_Ins01_PaySchd]ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR aPaySchdIfCrt_Ins01_PaySchd;
		
		
		// コンストラクタ
		protected PaySchdIfCrt_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR.class);
			aPaySchdIfCrt_Ins01_PaySchd = mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR.create();

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
			invoke((MSBHL_PaySchdIfCrtService)MSBHL_PaySchdIfCrtService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PaySchdIfCrt_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR createPaySchdIfCrt_Ins01_CndR(){
			return mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR.create();
		}

		/**
		 * PaySchdIfCrt_Ins01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR> createPaySchdIfCrt_Ins01_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR.class);
		}

		/**
		 * PaySchdIfCrt_Ins01_PaySchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR createPaySchdIfCrt_Ins01_PaySchdR(){
			return mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_CndR> up0() {
			return up0;
		}



		/**
		 * [PaySchdIfCrt_Ins01_PaySchd]ブロックのコンテナaPaySchdIfCrt_Ins01_PaySchdRを返します。
		 *
		 * @return PaySchdIfCrt_Ins01_PaySchdR
		 */
		public mcframe.serverMSBH.MSBHL5060.PaySchdIfCrt_Ins01_PaySchdR PaySchdIfCrt_Ins01_PaySchd() {
			return aPaySchdIfCrt_Ins01_PaySchd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdIfCrtService)MSBHL_PaySchdIfCrtService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}