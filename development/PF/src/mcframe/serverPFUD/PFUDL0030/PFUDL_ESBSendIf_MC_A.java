package mcframe.serverPFUD.PFUDL0030;

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
 * "PFUDL_ESBSendIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFUDL_ESBSendIf_MC_A extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFUD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFUDL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFUDL_ESBSendIf.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.PF_PFUDL0030_Upd01_INFO;
		this.aUpd01 = ((PFUDL_ESBSendIf)this).new Upd01();
	}

	public static PFUDL_ESBSendIf.Upd01 crtUpd01() {
		PFUDL_ESBSendIf lgc = new PFUDL_ESBSendIf();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0030.DtlR createDtlR(){
		return mcframe.serverPFUD.PFUDL0030.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0030.DtlR> createDtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	abstract public class Upd01 extends MCOperation implements mcframe.serverPFUD.PFUDL0030.IfPFUDL_ESBSendIf_Upd01 {
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
		private final MCList<mcframe.serverPFUD.PFUDL0030.DtlR> up0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);

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
			invoke((PFUDL_ESBSendIf)PFUDL_ESBSendIf_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0030.DtlR createDtlR(){
			return mcframe.serverPFUD.PFUDL0030.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0030.DtlR> createDtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>data_no</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>if_proc_typ</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sdrv_clt_id</td></tr>
		 * 	<tr><td><br></td><td>sdrv_usr_id</td></tr>
		 * 	<tr><td><br></td><td>sdrv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>attr_char1</td></tr>
		 * 	<tr><td><br></td><td>attr_char2</td></tr>
		 * 	<tr><td><br></td><td>attr_char3</td></tr>
		 * 	<tr><td><br></td><td>attr_char4</td></tr>
		 * 	<tr><td><br></td><td>attr_char5</td></tr>
		 * 	<tr><td><br></td><td>attr_char6</td></tr>
		 * 	<tr><td><br></td><td>attr_char7</td></tr>
		 * 	<tr><td><br></td><td>attr_char8</td></tr>
		 * 	<tr><td><br></td><td>attr_char9</td></tr>
		 * 	<tr><td><br></td><td>attr_char10</td></tr>
		 * 	<tr><td><br></td><td>attr_char11</td></tr>
		 * 	<tr><td><br></td><td>attr_char12</td></tr>
		 * 	<tr><td><br></td><td>attr_char13</td></tr>
		 * 	<tr><td><br></td><td>attr_char14</td></tr>
		 * 	<tr><td><br></td><td>attr_char15</td></tr>
		 * 	<tr><td><br></td><td>attr_char16</td></tr>
		 * 	<tr><td><br></td><td>attr_char17</td></tr>
		 * 	<tr><td><br></td><td>attr_char18</td></tr>
		 * 	<tr><td><br></td><td>attr_char19</td></tr>
		 * 	<tr><td><br></td><td>attr_char20</td></tr>
		 * 	<tr><td><br></td><td>attr_char21</td></tr>
		 * 	<tr><td><br></td><td>attr_char22</td></tr>
		 * 	<tr><td><br></td><td>attr_char23</td></tr>
		 * 	<tr><td><br></td><td>attr_char24</td></tr>
		 * 	<tr><td><br></td><td>attr_char25</td></tr>
		 * 	<tr><td><br></td><td>attr_char26</td></tr>
		 * 	<tr><td><br></td><td>attr_char27</td></tr>
		 * 	<tr><td><br></td><td>attr_char28</td></tr>
		 * 	<tr><td><br></td><td>attr_char29</td></tr>
		 * 	<tr><td><br></td><td>attr_char30</td></tr>
		 * 	<tr><td><br></td><td>attr_num1</td></tr>
		 * 	<tr><td><br></td><td>attr_num2</td></tr>
		 * 	<tr><td><br></td><td>attr_num3</td></tr>
		 * 	<tr><td><br></td><td>attr_num4</td></tr>
		 * 	<tr><td><br></td><td>attr_num5</td></tr>
		 * 	<tr><td><br></td><td>attr_dt1</td></tr>
		 * 	<tr><td><br></td><td>attr_dt2</td></tr>
		 * 	<tr><td><br></td><td>attr_dt3</td></tr>
		 * 	<tr><td><br></td><td>attr_dt4</td></tr>
		 * 	<tr><td><br></td><td>attr_dt5</td></tr>
		 * 	<tr><td><br></td><td>attr_tm1</td></tr>
		 * 	<tr><td><br></td><td>attr_tm2</td></tr>
		 * 	<tr><td><br></td><td>attr_tm3</td></tr>
		 * 	<tr><td><br></td><td>attr_tm4</td></tr>
		 * 	<tr><td><br></td><td>attr_tm5</td></tr>
		 * 	<tr><td><br></td><td>webapi_not_link_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0030.DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_ESBSendIf)PFUDL_ESBSendIf_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}