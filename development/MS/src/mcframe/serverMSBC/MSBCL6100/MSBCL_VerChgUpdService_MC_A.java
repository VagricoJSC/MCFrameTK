package mcframe.serverMSBC.MSBCL6100;

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
 * "MSBCL_VerChgUpdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_VerChgUpdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_VerChgUpdService.VerChg_Upd01 aVerChg_Upd01;

	protected void initVerChg_Upd01() {
		this.info = PDef.MS_MSBCL6100_VerChg_Upd01_INFO;
		this.aVerChg_Upd01 = ((MSBCL_VerChgUpdService)this).new VerChg_Upd01();
	}

	public static MSBCL_VerChgUpdService.VerChg_Upd01 crtVerChg_Upd01() {
		MSBCL_VerChgUpdService lgc = new MSBCL_VerChgUpdService();
		lgc.initVerChg_Upd01();
		return lgc.aVerChg_Upd01;
	}

	protected void paramVerChg_Upd01(MCParam p) {
		if (this.aVerChg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aVerChg_Upd01.up0());
	}

	protected void doVerChg_Upd01() {
		aVerChg_Upd01.call();
	};

	/**
	 * VerChgUpd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR createVerChgUpd_DtlR(){
		return mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR.create();
	}

	/**
	 * VerChgUpd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR> createVerChgUpd_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * VerChg_Upd01オペレーション.<p>
	 *
	 * 版切替情報の指図、実績関連の項目を更新する<br>
	 */
	abstract public class VerChg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "VerChg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR> up0;
		
		
		// コンストラクタ
		protected VerChg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR.class);

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
			invoke((MSBCL_VerChgUpdService)MSBCL_VerChgUpdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * VerChgUpd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR createVerChgUpd_DtlR(){
			return mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR.create();
		}

		/**
		 * VerChgUpd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR> createVerChgUpd_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_chg_p.site_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6100.VerChgUpd_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_VerChgUpdService)MSBCL_VerChgUpdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}