package mcframe.clientMABC.MABCP0850;

import mcframe.clientCore.beans.tree.MCTree;
import mcframe.clientCore.beans.tree.MCTree64DefaultDelegate;
import mcframe.clientCore.beans.tree.MCTreeNode;

public class MCTree64AppDelegate extends MCTree64DefaultDelegate {

	@Override
	public boolean canMoveNode(int type, MCTree dropTree, MCTreeNode dropNode,
			MCTree dropedTree, MCTreeNode droppedNode) {

		// ツリー自体が移動可能か（モードによる制御（画面側））
		if (!((MABCP_SlsItmGrpReg)dropTree.getRootPanel()).canDragAndDrop(dropTree)) {
			return false;
		}

		// 自分の中でのみ移動可能
		if (dropTree != dropedTree) {
			return false;
		}
		// ドラッグ対象の販売品目体系、ドロップ先の親販売品目体系の論理削除がオンのとき移動不可
		if (!((MABCP_SlsItmGrpReg)dropTree.getRootPanel()).notDelSlsItmGrp(dropTree, dropNode)) {
			return false;
		}
		if (!((MABCP_SlsItmGrpReg)dropTree.getRootPanel()).notDelSlsItmGrp(dropedTree, droppedNode)) {
			return false;
		}
		return chkCanDrop(dropNode, droppedNode);
	}

	/**
	 * ドロップ先から親をたどって、自分自身にぶつからなければドロップ可能（再帰的にチェック）
	 * 
	 * @param dropNode ドロップした先のノード
	 * @param droppedNode ドロップされたノード
	 * @return ドロップ可能なときtrue
	 */
	protected boolean chkCanDrop(MCTreeNode dropNode, MCTreeNode droppedNode) {
		if (dropNode.equals(droppedNode)) {
			return false;
		}
		if (dropNode.getParentNode() == null) {
			return true;
		}
		return chkCanDrop(dropNode.getParentNode(), droppedNode);
	}

	@Override
	public void treePathChanged(int type, MCTree dropTree, MCTree dragTree, MCTreeNode node, MCTreeNode oldParentNode,
			MCTreeNode newParentNode) {
		super.treePathChanged(type, dropTree, dragTree, node, oldParentNode, newParentNode);

		((MABCP_SlsItmGrpReg)dropTree.getRootPanel()).setDropFlgTrue();
	}
}